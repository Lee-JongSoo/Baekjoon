import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String find = br.readLine();

        int answer = 0;
        for (int i = 0; i < input.length() - find.length() + 1; i++) {
            String tmp = input.substring(i, i + find.length());
            if (tmp.equals(find)) {
                answer++;
                i += find.length();
                i--;
            }
        }
        System.out.println(answer);
    }
}
