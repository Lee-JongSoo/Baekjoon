import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static long p = 1000000007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long number = factorial(n);
        long answer = factorial(k) * factorial(n - k) % p;

        System.out.println(number * pow(answer, p - 2) % p);
    }

    public static long factorial(long n) {
        long fac = 1L;

        while (n > 1) {
            fac = (fac * n) % p;
            n--;
        }
        return fac;
    }

    public static long pow(long base, long expo) {
        long result = 1;

        while (expo > 0) {
            if (expo % 2 == 1) {
                result *= base;
                result %= p;
            }
            base = (base * base) % p;
            expo /= 2;
        }
        return result;
    }

}
