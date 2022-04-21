import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            LinkedList<int[]> list = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < x; i++) {
                list.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!list.isEmpty()) {
                int[] front = list.poll();
                boolean max = true;

                for (int i = 0; i < list.size(); i++) {
                    if (front[1] < list.get(i)[1]) {
                        list.offer(front);
                        for (int j = 0; j < i; j++) {
                            list.offer(list.poll());
                        }
                        max = false;
                        break;
                    }
                }
                if (max == false) {
                    continue;
                }

                count++;
                if (front[0] == y) {
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
