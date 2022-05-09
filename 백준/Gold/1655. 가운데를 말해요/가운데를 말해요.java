import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minPQ = new PriorityQueue<>((o1, o2) -> o1 - o2);
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (maxPQ.size() == minPQ.size()) maxPQ.offer(num);
            else minPQ.offer(num);

            if (!maxPQ.isEmpty() && !minPQ.isEmpty()) {
                if (minPQ.peek() < maxPQ.peek()) {
                    int tmp = minPQ.poll();
                    minPQ.offer(maxPQ.poll());
                    maxPQ.offer(tmp);
                }
            }
            sb.append(maxPQ.peek()).append('\n');
        }
        System.out.println(sb);
    }
}
