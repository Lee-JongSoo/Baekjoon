import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class LIS5_14003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(Integer.MIN_VALUE);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] indexArr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (lis.get(lis.size() - 1) < arr[i]) {
                lis.add(arr[i]);
                indexArr[i] = lis.size() - 1;
            } else {
                int left = 1;
                int right = lis.size() - 1;

                while (left < right) {
                    int mid = (left + right) >> 1;
                    if (lis.get(mid) < arr[i]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                lis.set(right, arr[i]);
                indexArr[i] = right;
            }
        }
        int index = lis.size() - 1;

        System.out.println(index);

        Stack<Integer> stack = new Stack<>();
        for (int i = n; i > 0; i--) {
            if (indexArr[i] == index) {
                index--;
                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
