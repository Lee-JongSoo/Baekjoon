import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nCr_11050 {
    int[][] dy=new int[35][35];
    public int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]=DFS(n-1, r-1)+DFS(n-1, r);
    }
    public static void main(String[] args) throws IOException {
        nCr_11050 T = new nCr_11050();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.println(T.DFS(n, r));
    }
}
