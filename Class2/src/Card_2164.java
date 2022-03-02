import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        int i = 0;

        while (true) {
            if (q.size() == 1){
                System.out.println(q.peek());
                break;
            }
            if (i == 0) {
                q.poll();
                i++;
            } else{
                q.offer(q.poll());
                i--;
            }
        }
    }
}
