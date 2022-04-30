import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }

        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) one++;
        }

        String answer = "";
        StringBuilder sb = new StringBuilder();
        if (one > 1) {
            answer += "I'm Sorry Hansoo";
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr[i] / 2; k++) {
                    sb.append((char) (i + 65));
                }
            }
            answer += sb.toString();
            String end = sb.reverse().toString();

            sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    sb.append((char) (i + 65));
                }
            }
            answer += sb.toString() + end;
        }
        System.out.println(answer);
    }
}
