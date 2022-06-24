import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        long[] s = new long[n];
        long[] c = new long[t];
        long[] arr = new long[n];
        long answer = 0;
        long sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i =0 ; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            sum += arr[i];
            s[i] += sum;
        }

        for (int i = 0; i < n; i++) {
            int remainder = (int) (s[i] % t);

            if (remainder == 0) answer++;

            c[remainder]++;
        }

        for (int i = 0; i < t; i++) {
            if (c[i] > 1) answer = answer + (c[i] * (c[i] - 1) / 2);
        }
        System.out.println(answer);
    }
}
