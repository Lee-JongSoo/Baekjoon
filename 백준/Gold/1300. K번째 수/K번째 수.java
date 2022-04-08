import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int left = 1;
        int right = (int) Math.min((long) N * N, (long) 1000000000);
        int mid;
        int ans = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            int cnt = getCnt(mid, N);

            if (cnt >= K) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }

    static int getCnt(int x, int N) {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            cnt += Math.min(x / i, N);
        }
        return cnt;
    }
}