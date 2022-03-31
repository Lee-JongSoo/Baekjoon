import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int n, c, index;
    static int[] sack;
    static ArrayList<Integer> sumA, sumB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        sack = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sack[i] = Integer.parseInt(st.nextToken());
        }

        sumA = new ArrayList<>();
        sumB = new ArrayList<>();

        setSumA(0, 0);
        setSumB(n / 2, 0);
        Collections.sort(sumB);

        int answer = 0;
        for (int i = 0; i < sumA.size(); i++) {
            index = -1;
            bs(0, sumB.size() - 1, sumA.get(i));
            answer += index + 1;
        }

        System.out.println(answer);
    }

    static void setSumA(int i, int sum) {
        if (sum > c) return;

        if (i == n / 2) {
            sumA.add(sum);
            return;
        }
        setSumA(i + 1, sum + sack[i]);
        setSumA(i + 1, sum);
    }

    static void setSumB(int i, int sum) {
        if (sum > c) return;

        if (i == n) {
            sumB.add(sum);
            return;
        }
        setSumB(i + 1, sum + sack[i]);
        setSumB(i + 1, sum);
    }

    static void bs(int lt, int rt, int value) {
        if (lt>rt) return;

        int mid = (lt + rt) / 2;
        if (sumB.get(mid) + value <= c) {
            index = mid;
            bs(mid + 1, rt, value);
        } else {
            bs(lt, mid - 1, value);
        }
    }
}
