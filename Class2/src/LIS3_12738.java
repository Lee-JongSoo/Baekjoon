import java.io.*;
import java.util.*;

public class LIS3_12738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(Integer.MIN_VALUE);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
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
        }
        System.out.println(lis.size() - 1);
    }
}
