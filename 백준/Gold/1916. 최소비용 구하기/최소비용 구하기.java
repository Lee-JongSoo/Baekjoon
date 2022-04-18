import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class EdgeT implements Comparable<EdgeT> {
    public int vex;
    public int cost;

    public EdgeT(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }


    @Override
    public int compareTo(EdgeT o) {
        return this.vex - o.vex;
    }
}

public class Main {

    static int n, m;
    static ArrayList<ArrayList<EdgeT>> graph;
    static int[] dis;

    public int solution(int start, int end) {
        PriorityQueue<EdgeT> pQ = new PriorityQueue<>();
        pQ.offer(new EdgeT(start, 0));
        dis[start] = 0;

        while (!pQ.isEmpty()) {
            EdgeT tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if (nowCost>dis[now]) continue;

            for (EdgeT edgeT : graph.get(now)) {
                if (dis[edgeT.vex] > nowCost + edgeT.cost) {
                    dis[edgeT.vex] = nowCost + edgeT.cost;
                    pQ.offer(new EdgeT(edgeT.vex, nowCost + edgeT.cost));
                }
            }
        }

        return dis[end];
    }


    public static void main(String[] args) throws IOException {
        Main minValue = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new ArrayList<ArrayList<EdgeT>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<EdgeT>());
        }
        
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new EdgeT(b, c));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        System.out.println(minValue.solution(start, end));
    }
}
