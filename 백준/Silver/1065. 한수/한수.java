import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if (n < 100) {
            count = n;
        } else {
            count = 99;
            if (n == 1000) n = 999;
            for (int i = 100; i <= n; i++) {
                int h = i / 100;
                int t = (i / 10) % 10;
                int o = i % 10;
                if ((h - t) == (t - o)) count++;
            }
        }
        System.out.println(count);
    }
}