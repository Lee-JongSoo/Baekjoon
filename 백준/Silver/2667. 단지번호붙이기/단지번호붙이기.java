import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static int answer = 0, n;
    static int count;

    public static void main(String[] args) throws IOException {
        Main scoring = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        scoring.solution(arr);
        System.out.println(answer);
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                count++;
                DFS(nx, ny, board);
            }
        }
    }

    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count = 0;
                if (board[i][j] == 1) {
                    answer++;
                    count++;
                    board[i][j] = 0;
                    DFS(i, j, board);
                    arrayList.add(count);
                }
            }
        }
    }
}
