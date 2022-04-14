import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visit;
    static int[][] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        arr = new int[node + 1][node + 1];
        visit = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(node, 1);

        System.out.println(count - 1);

    }

    public static void dfs(int node, int s) {

        visit[s] = true;
        count++;

        for (int i = 0; i <= node; i++) {
            if (arr[s][i] == 1 && !visit[i]) {
                dfs(node, i);
            }
        }
    }
}
