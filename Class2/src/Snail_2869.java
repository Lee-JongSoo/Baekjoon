import java.util.Scanner;

public class Snail_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int count = 0;
        int day = 0;

        while (v != day) {
            if (count != v) {
                day++;
                count += a;
                if (count == v) break;
                count -= b;
            }
        }
        System.out.println(day);
    }
}
