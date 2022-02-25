import java.util.Scanner;
import java.util.Stack;

public class BalanceWorld_4949 {

    public String solution(String str) {
        String answer = "yes";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(' || x == '[') {
                stack.push(x);
            }
            else if (x == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return "no";
                else stack.pop();
            }
            else if (x == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return "no";
                else stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return answer;
        } else return "no";
    }

    public static void main(String[] args) {
        BalanceWorld_4949 balanceWorld = new BalanceWorld_4949();
        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            str = sc.nextLine();

            if (str.equals(".")) break;
            System.out.println(balanceWorld.solution(str));
        }
    }

}
