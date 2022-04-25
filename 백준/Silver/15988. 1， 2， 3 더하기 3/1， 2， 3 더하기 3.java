import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        long dp[] = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 4; j <= num; j++) {
                if (dp[j] == 0) {
                    dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
                    dp[j] %= 1000000009;
                }
            }
            sb.append(String.valueOf(dp[num])).append('\n');
        }
        System.out.println(sb);
    }
}
