import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LIS0_11055 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(0);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int total = 0;
            if (lis.get(lis.size() - 1) < arr[i]) {
                lis.add(arr[i]);
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
            }
            total = lis.stream().mapToInt(Integer::intValue).sum();
            if (max <= total) max = total;
        }
        System.out.println(max);
    }
}
