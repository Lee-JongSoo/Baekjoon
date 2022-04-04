import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<Integer>[] list;
    static int[] task;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        task = new int[m + 1];
        check = new boolean[m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int get = Integer.parseInt(st.nextToken());
            for (int j = 0; j < get; j++) {
                list[i].add(Integer.parseInt(st.nextToken()));
            }
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(check, false);
                if (DFS(i)) cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean DFS(int ready) {
        for (int index : list[ready]) {
            if (check[index]) continue;

            check[index] = true;
            if (task[index] == 0 || DFS(task[index])) {
                task[index] = ready;
                return true;
            }
        }
        return false;
    }
}
