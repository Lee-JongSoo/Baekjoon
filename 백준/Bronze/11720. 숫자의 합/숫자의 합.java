import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String[] strs = s.split("");

        int sum = 0;
        for (String str : strs) {
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
