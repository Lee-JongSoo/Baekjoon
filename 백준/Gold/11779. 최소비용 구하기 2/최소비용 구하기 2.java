import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge4 implements Comparable<Edge4> {
    public int vex;
    public int cost;

    public Edge4(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }


    @Override
    public int compareTo(Edge4 o) {
        return this.cost - o.cost;
    }
}

public class Main {

    static int n, m;
    static ArrayList<ArrayList<Edge4>> graph;
    static int[] dis;
    static int[] route;

    public int solution(int start, int end) {
        PriorityQueue<Edge4> pQ = new PriorityQueue<>();
        pQ.offer(new Edge4(start, 0));
        dis[start] = 0;

        while (!pQ.isEmpty()) {
            Edge4 tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if (nowCost>dis[now]) continue;

            for (Edge4 edgeT : graph.get(now)) {
                if (dis[edgeT.vex] > nowCost + edgeT.cost) {
                    dis[edgeT.vex] = nowCost + edgeT.cost;
                    pQ.offer(new Edge4(edgeT.vex, nowCost + edgeT.cost));
                    route[edgeT.vex] = now;
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

        graph = new ArrayList<ArrayList<Edge4>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge4>());
        }

        dis = new int[n + 1];
        route = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge4(b, c));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        ArrayList<Integer> routes = new ArrayList<>();
        System.out.println(minValue.solution(start, end));
        int current = end;
        while (current != 0) {
            routes.add(current);
            current = route[current];
        }
        System.out.println(routes.size());
        for (int i = routes.size() - 1; i >= 0; i--) {
            System.out.print(routes.get(i) + " ");
        }

    }
}
