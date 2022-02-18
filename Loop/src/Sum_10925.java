import java.io.*;
import java.util.StringTokenizer;

public class Sum_10925 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {

            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A==0 && B==0) {
                break;
            }
            sb.append((A+B)).append('\n');
        }
        System.out.println(sb);
    }
}