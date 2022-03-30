import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean booleans[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        booleans = new boolean[n + 1];
        as();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = m; i <= n; i++) {
            if(booleans[i] == false) {
                sum += i;
                if(min == Integer.MAX_VALUE) min = i;
            }
        }
        if (sum == 0) System.out.println(-1);
        else {
            sb.append(sum).append("\n");
            sb.append(min).append("\n");
            System.out.println(sb);
        }

    }

    public static void as() {
        booleans[0] = booleans[1] = true;

        for(int i = 2; i <= Math.sqrt(booleans.length); i++) {
            if(booleans[i]) continue;
            for(int j = i * i; j < booleans.length; j += i) booleans[j] = true;

        }
    }
}
