import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point10 {
    int x, y;

    public Point10(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point10> hs, ck;

    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point10 h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - ck.get(i).x) + Math.abs(h.y - ck.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Main deliveryChicken = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ck = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp == 1) {
                    hs.add(new Point10(i, j));
                }
                else if (tmp == 2) {
                    ck.add(new Point10(i, j));
                }
            }
        }

        len = ck.size();
        combi = new int[m];
        deliveryChicken.DFS(0, 0);
        System.out.println(answer);
    }
}
