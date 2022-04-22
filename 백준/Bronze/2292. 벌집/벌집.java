import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int c = 1;
        int r = 2;
        if (n == 1) {
            System.out.println(1);
        } else {
            while (r <= n) {
                r += (6 * c);
                c++;
            }
            System.out.println(c);
        }
    }
}
