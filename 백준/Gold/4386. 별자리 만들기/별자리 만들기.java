import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class Main {
    static int n;
    static Point[] stars;
    static double[][] costMatrix;
    static boolean[] visited;
    public static class Point{
        double x,y;
        Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
 
    public static class Edge implements Comparable<Edge>{
        double dist;
        int nodeNum;
        public Edge(double dist, int nodeNum){
            this.dist = dist;
            this.nodeNum = nodeNum;
        }
 
        @Override
        public int compareTo(Edge other){
            return (int) (this.dist - other.dist);
        }
    }
 
 
    public static double getDistance(Point a, Point b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
 
    public static double findMST(){
        PriorityQueue<Edge> q = new PriorityQueue<>();
        q.offer(new Edge(0,0));
        int count = 0;
        double mst = 0;
 
        while (count < n){
            Edge edge = q.poll();
            double currDistance = edge.dist;
            int nodeNum = edge.nodeNum;
 
            if(!visited[nodeNum]){
                visited[nodeNum] = true;
                mst += currDistance;
                count += 1;
                for(int i = 0; i < n; i++){
                    double dist = costMatrix[nodeNum][i];
                    q.offer(new Edge(dist, i));
                }
            }
        }
        return Math.round(mst * 100) / 100.0;
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
 
        stars = new Point[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            stars[i] = new Point(x,y);
        }
 
        costMatrix = new double[n][n];
        for(int i =0; i< n; i++){
            for(int j = 0; j < n; j++){
                costMatrix[i][j] = getDistance(stars[i], stars[j]);
            }
        }
 
        visited = new boolean[n];
        double answer = findMST();
        System.out.println(answer);
    }
}