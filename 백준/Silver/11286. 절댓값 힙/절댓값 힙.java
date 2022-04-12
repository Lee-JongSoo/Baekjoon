import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

class Com implements Comparable<Com> {

    public int num1;
    public int num2;

    public Com(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int compareTo(Com o) {
        if (this.num2 == o.num2) return this.num1 - o.num1;
        else return this.num2 - o.num2;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Com> pque = new PriorityQueue<Com>();

        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                sb.append(pque.size() == 0 ? 0 : pque.poll().num1).append('\n');
            } else pque.add(new Com(num, Math.abs(num)));
        }
        System.out.println(sb);
    }
}
