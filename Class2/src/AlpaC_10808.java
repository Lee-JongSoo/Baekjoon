import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlpaC_10808 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[26];

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            cnt[(int) str.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < cnt.length; i++) {
            sb.append(cnt[i]).append(" ");
        }

        System.out.println(sb);
    }
}
