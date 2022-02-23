import java.util.Scanner;

public class Decimal_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int x : arr) {
            if (x == 1) continue;
            int p = 0;
            for (int i = 2; i < x; i++) {
                if (x != i && x % i == 0 && x > i) {
                    p++;
                }
            }
            if (p == 0) count++;
        }

        System.out.println(count);
    }
}
