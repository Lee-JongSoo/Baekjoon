import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class EdgeSP implements Comparable<EdgeSP> {

    public int vex;
    public int cost;

    public EdgeSP(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(EdgeSP o) {
        return this.cost - o.cost;
    }
}

public class Main {

    static int n, m, k;
    static ArrayList<ArrayList<EdgeSP>> graph;
    static int[] dis;

    public void solution(int v) {
        PriorityQueue<EdgeSP> pQ = new PriorityQueue<>();
        pQ.offer(new EdgeSP(v, 0));
        dis[v] = 0;

        while (!pQ.isEmpty()) {
            EdgeSP tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if (nowCost > dis[now]) continue;

            for (EdgeSP edge : graph.get(now)) {
                if (dis[edge.vex] > nowCost + edge.cost) {
                    dis[edge.vex] = nowCost + edge.cost;
                    pQ.offer(new EdgeSP(edge.vex, nowCost + edge.cost));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main shortestPath = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());
        graph = new ArrayList<ArrayList<EdgeSP>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<EdgeSP>());
        }

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new EdgeSP(b, c));
        }

        shortestPath.solution(k);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) sb.append(dis[i]).append("\n");
            else sb.append("INF").append("\n");
        }

        System.out.println(sb);
    }
}
