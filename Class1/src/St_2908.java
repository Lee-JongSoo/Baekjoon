import java.util.Scanner;

public class St_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result1 = (n1 / 100) + (((n1 / 10) % 10) * 10) + ((n1 % 10) * 100);
        int result2 = (n2 / 100) + (((n2 / 10) % 10) * 10) + ((n2 % 10) * 100);

        System.out.println(Math.max(result1, result2));
    }
}
