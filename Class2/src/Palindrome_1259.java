import java.util.Scanner;

public class Palindrome_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            String str = Integer.toString(n);
            String tmp = new StringBuilder(str).reverse().toString();
            if (str.equalsIgnoreCase(tmp)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
