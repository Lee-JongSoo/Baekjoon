import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int n, m, answer;

    public static void main(String[] args) throws IOException {
        Main cabbage = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            boolean[][] arr = new boolean[m][n];


            for (int j = 0; j < count; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = true;
            }

            cabbage.solution(arr);
            System.out.println(answer);
        }
    }

    private static void DFS(int x, int y, boolean[][] board) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n && board[nx][ny] == true) {
                board[nx][ny] = false;
                DFS(nx, ny, board);
            }
        }
    }

    private static void solution(boolean[][] board) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == true) {
                    answer++;
                    board[i][j] = false;
                    DFS(i, j, board);
                }
            }
        }
    }
}
