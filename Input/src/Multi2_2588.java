import java.util.Scanner;

public class Multi2_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int multi = num1 * num2;

        for (int i = 0; i < 3; i++) {
            int result = num2 % 10;
            num2 /= 10;
            System.out.println(result * num1);
        }
        System.out.println(multi);
    }
}
