import java.util.Scanner;

public class Palindrome_1259 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            String str = kb.next();
            if (str.equals("0")) break;
            String answer = "yes";

            String tmp = new StringBuilder(str).reverse().toString();
            if (!str.equalsIgnoreCase(tmp)) {
                System.out.println("no");
            }else {
                System.out.println(answer);
            }
        }
    }
}
