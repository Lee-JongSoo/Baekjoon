import java.util.Scanner;
import java.util.Stack;

public class Postfix_1935 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                double d = arr[ch - 'A'];
                stack.push(d);
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                double result = 0.0;

                switch (ch) {
                    case '+':
                        result = num2 + num1;
                        break;
                    case '-':
                        result = num2 - num1;
                        break;
                    case '*':
                        result = num2 * num1;
                        break;
                    case '/':
                        result = num2 / num1;
                        break;
                }
                stack.push(result);
            }
        }

        System.out.printf("%.2f",stack.pop());
    }
}
