import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class OX_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int add = 0;
        String str = "";
        Stack<Character> stack = new Stack<>();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                stack.push(str.charAt(j));
            }
            while (!stack.isEmpty()){
                if (stack.pop() == 'O') {
                    add++;
                    sum += add;
                } else add = 0;
            }
            add = 0;
            System.out.println(sum);
            sum = 0;
        }
    }
}
