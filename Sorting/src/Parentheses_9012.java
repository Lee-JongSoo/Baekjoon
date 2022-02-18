import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses_9012 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            int length = str.length();

            for(int j=0; j<length; j++) {
                char ch = str.charAt(j);

                if(ch == '(') {
                    stack.push(ch);
                }
                else {
                    int size = stack.size();
                    if(size == 0) {
                        stack.push(ch);
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }

            if(stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

            stack.clear();
        }
    } // End Main
}