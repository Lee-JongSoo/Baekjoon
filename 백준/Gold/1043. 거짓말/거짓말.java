import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m, knowPeople;
    static int[] parent;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parent = new int[n + 1];
        Arrays.fill(parent, - 1);

        st = new StringTokenizer(br.readLine());
        knowPeople = Integer.parseInt(st.nextToken());
        for (int i = 0; i < knowPeople; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            parent[tmp] = tmp;
        }

        for (int i = 0; i < m; i++) {
            list.add(new ArrayList<>());
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            for (int j = 0; j < k; j++) {
                list.get(i).add(Integer.parseInt(st.nextToken()));
            }

            if (list.get(i).size() >= 2) {
                doUnion(i);
            }
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            if (particpate(i)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    static boolean particpate(int i) {
        for (int k : list.get(i)) {
            int tmp = find(k);
            if (parent[tmp] == tmp) {
                return false;
            }
        }
        return true;
    }

    static void doUnion(int u) {
        int first = list.get(u).get(0);

        for (int i = 1; i < list.get(u).size(); i++) {
            union(first,list.get(u).get(i));
        }
    }

    static void union(int u, int v) {
        u = find(u);
        v = find(v);
        if (u != v) {
            if (u == parent[u]) {
                parent[v] = u;
            } else {
                parent[u] = v;
            }
        }
    }

    static int find(int x) {
        if (parent[x] < 0 || x ==parent[x]) return x;

        return parent[x] = find(parent[x]);
    }
}
