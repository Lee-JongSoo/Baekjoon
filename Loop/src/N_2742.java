import java.io.*;

public class N_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int i = N;

        while(i>= 1) {
            bw.write(i+"\n");
            i--;
        }
        bw.flush();
        bw.close();
    }
}
