import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            Stack<Character> stackTmp = new Stack<>();
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                switch (str.charAt(j)) {
                    case '<':
                        if (!stack.isEmpty()) stackTmp.push(stack.pop());
                        break;
                    case '>':
                        if (!stackTmp.isEmpty()) stack.push(stackTmp.pop());
                        break;
                    case '-':
                        if (!stack.isEmpty()) stack.pop();
                        break;
                    default:
                        stack.push(str.charAt(j));
                        break;
                }
            }
            while (!stackTmp.isEmpty()) {
                stack.push(stackTmp.pop());
            }
            for (int j = 0; j < stack.size(); j++) {
                sb.append(stack.elementAt(j));
            }
            System.out.println(sb);
        }
    }
}
