import java.util.Scanner;

public class SumCycle_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n;
        int cnt = 0;

        while (true) {
            n2 = ((n2 / 10) + (n2 % 10)) % 10 + ((n2 % 10) * 10);
            cnt++;
            if (n == n2) break;
        }
        System.out.println(cnt);
    }
}
