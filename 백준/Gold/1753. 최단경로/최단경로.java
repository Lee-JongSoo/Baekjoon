import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Main shortestPath = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        graph = new ArrayList<ArrayList<EdgeSP>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<EdgeSP>());
        }

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new EdgeSP(b, c));
        }

        shortestPath.solution(k);

        for (int i = 1; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) System.out.println(dis[i]);
            else System.out.println("INF");
        }
    }
}
