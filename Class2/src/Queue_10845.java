import java.io.*;
import java.util.*;

public class Queue_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<Integer>();
        int b = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    b = num;
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(q.remove() + "\n");
                    }
                    break;
                case "size":
                    sb.append(q.size() + "\n");
                    break;
                case "empty":
                    if (q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peek() + "\n");
                    break;
                case "back":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(b + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}