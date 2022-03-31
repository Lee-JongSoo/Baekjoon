import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static Integer[] rdp;
    static Integer[] ldp;
    static int[] seq;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        rdp = new Integer[n];
        ldp = new Integer[n];
        seq = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            LIS(i);
            LDS(i);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(rdp[i] + ldp[i], max);
        }
        System.out.println(max - 1);
    }

    static int LIS(int n) {
        if (rdp[n] == null) {
            rdp[n] = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (seq[i] < seq[n]) {
                    rdp[n] = Math.max(rdp[n], LIS(i) + 1);
                }
            }
        }
        return rdp[n];
    }

    static int LDS(int n) {
        if (ldp[n] == null) {
            ldp[n] = 1;
            for (int i = n + 1; i < ldp.length; i++) {
                if (seq[i] < seq[n]) {
                    ldp[n] = Math.max(ldp[n], LDS(i) + 1);
                }
            }
        }
        return ldp[n];
    }
}
