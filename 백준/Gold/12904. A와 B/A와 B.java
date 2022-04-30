import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str1 = new StringBuffer(br.readLine());
        StringBuffer str2 = new StringBuffer(br.readLine());

        while (str1.length() < str2.length()) {
            if (str2.charAt(str2.length() - 1) == 'A') {
                str2.deleteCharAt(str2.length() - 1);
            } else if (str2.charAt(str2.length() - 1) == 'B') {
                str2.deleteCharAt(str2.length() - 1);
                str2.reverse();
            }
        }

        if (str1.toString().equals(str2.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
