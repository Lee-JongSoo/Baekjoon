import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final int div = 10007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        System.out.println((factorial(n) * mod_inverse((factorial(n - k) * factorial(k)) % div, div - 2)) % div);

    }

    static int factorial(int n) {
        if(n <=1) return 1;
        return (n * factorial(n - 1)) % div;
    }

    static int mod_inverse(int a, int p) {
        int ret = 1;
        while (p > 0) {
            if (p % 2 == 1) {

                ret *= a;
                p--;
                ret %= div;
            }
            a *= a;
            a %= div;
            p >>= 1;
        }
        return ret;
    }

}
