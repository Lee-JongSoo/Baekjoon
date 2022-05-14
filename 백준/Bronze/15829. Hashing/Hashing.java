import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = new String(br.readLine());
        int m = 1234567891;
        long sum  =0;
        long pow = 1;
        char[] arr = str.toCharArray();

        for (int i = 0; i < n; i++) {
            sum += (arr[i] - 'a' + 1) * pow % m;
            pow = pow * 31 % m;
        }
        long hash = sum % m;
        System.out.println(hash);
    }
}
