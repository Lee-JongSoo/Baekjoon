import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int time = 0, count = 0;
    static boolean visited[] = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            System.out.println(1);
        } else {
            BFS(n);
            System.out.println(time);
            System.out.println(count);
        }

    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();

        time = 0;
        queue.offer(node);

        while (!queue.isEmpty()) {
            if (count != 0) {
                return;
            }

            for (int i = 0, size = queue.size(); i < size; i++) {
                int now = queue.poll();
                visited[now] = true;
                int next;

                next = now - 1;
                if (next == k) count++;
                else if (next >= 0 && !visited[next]){
                    queue.offer(next);
                }

                next = now + 1;
                if (next == k) count++;
                else if (next < 100001 && !visited[next]) {
                    queue.offer(next);
                }

                next = now * 2;
                if (next == k) count++;
                else if (next < 100001 && !visited[next]) {
                    queue.offer(next);
                }
            }
            time++;
        }
    }
}
