import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int max = 1000000;

        long v[] = new long[max + 1];
        long sum[] = new long[max + 1];

        for (int i = 1; i <= max; i++) {
            v[i] = 1;
        }

        for (int i = 2; i <= max; i++) {
            for (int j = 1; j * i <= max; j++) {
                v[i * j] += i;
            }
        }

        for (int i = 1; i <= max; i++) {
            sum[i] = sum[i - 1] + (int) v[i];
        }

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            sb.append(sum[num]).append('\n');
        }
        System.out.println(sb);
    }
}
