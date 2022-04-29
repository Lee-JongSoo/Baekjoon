import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int[] arr = new int[num + 1];

            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x] = y;
            }

            int count = 1;
            int st = arr[1];
            for (int i = 2; i <= num; i++) {
                if (st > arr[i]) {
                    count++;
                    st = arr[i];
                }
            }
            System.out.println(count);
        }
    }
}
