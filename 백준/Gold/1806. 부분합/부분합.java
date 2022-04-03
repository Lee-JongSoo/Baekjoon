import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
           arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 100001, sum = 0, lt = 0, rt = 0;
        while (true) {
            if (sum >= m) {
                sum -= arr[lt];
                answer = Math.min(answer, (rt - lt));
                lt++;
            } else if (rt == n) {
                break;
            } else {
                sum += arr[rt++];
            }
        }
        if (answer == 100001) {
            System.out.println(0);
        } else {
            System.out.println(answer);

        }
    }
}
