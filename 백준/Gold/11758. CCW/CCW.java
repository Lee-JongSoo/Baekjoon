import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Point11[] point = new Point11[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            point[i] = new Point11(x, y);
        }

        bw.write(ccw(point) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int ccw(Point11[] p) {
        int result = ((p[0].x * p[1].y) + (p[1].x * p[2].y) + (p[2].x * p[0].y))
                - ((p[0].y * p[1].x) + (p[1].y * p[2].x) + (p[2].y * p[0].x));
        if (result > 0)
            return 1;
        else if (result == 0)
            return 0;
        else
            return -1;
    }

    static class Point11 {
        int x, y;

        public Point11(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
