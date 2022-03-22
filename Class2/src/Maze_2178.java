import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Point3{
    public int x, y;

    Point3(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Maze_2178 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;

    public void BFS(int x, int y){
        Queue<Point3> Q = new LinkedList<>();
        Q.offer(new Point3(x, y));
        board[x][y] = 0;
        while(!Q.isEmpty()){
            Point3 tmp = Q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.offer(new Point3(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Maze_2178 T = new Maze_2178();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        dis  = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }
        T.BFS(0, 0);
        if (dis[n - 1][m - 1] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[n - 1][m - 1] + 1);
        }
    }
}