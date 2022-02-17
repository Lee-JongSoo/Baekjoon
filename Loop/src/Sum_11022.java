import java.io.*;
import java.util.StringTokenizer;

public class Sum_11022 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a;
        int b;

        StringTokenizer st;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": "
                    + a+ " + " + b + " = "
                    + (a + b) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
