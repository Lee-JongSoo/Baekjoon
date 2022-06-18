import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }

        long max = Arrays.stream(arr).max().getAsInt();
        max++;
        long min = 0;
        long mid = 0;

        while (min < max) {
            long count = 0;
            mid = (max + min) / 2;

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if (count < n) max = mid;
            else min = mid + 1;
        }
        System.out.println(min - 1);
    }
}
