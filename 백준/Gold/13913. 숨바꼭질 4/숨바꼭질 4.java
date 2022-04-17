import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        BFS(n, k);

    }

    private static void BFS(int n, int k) throws IOException {
        int max = 2 * Math.max(n, k) + 1;
        int[] prev = new int[max];
        Arrays.fill(prev, -1);
        prev[n] = -2;

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        boolean[] visited = new boolean[max];

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (visited[cur]) continue;
            visited[cur] = true;

            if (cur == k) {
                print(cur, prev);
                return;
            }
            if (cur - 1 >= 0 && prev[cur - 1] == -1) {
                q.add(cur - 1);
                prev[cur - 1] = cur;
            }
            if (cur + 1 < max && prev[cur + 1] == -1) {
                q.add(cur + 1);
                prev[cur + 1] = cur;
            }
            if (cur * 2 < max && prev[cur * 2] == -1) {
                q.add(cur * 2);
                prev[cur * 2] = cur;
            }
        }
    }

    private static void print(int cur, int[] prev) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tmp = cur;
        int sec = 0;
        List<Integer> outputList = new LinkedList<>();
        while (tmp >= 0) {
            outputList.add(tmp);
            tmp = prev[tmp];
            sec++;
        }
        bw.write((sec - 1) + "\n");
        for (int i = outputList.size() - 1; i >= 0; i--) {
            bw.write(outputList.get(i) + " ");
        }
        bw.close();
    }
}
