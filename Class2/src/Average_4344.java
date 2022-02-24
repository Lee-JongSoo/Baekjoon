import java.util.Arrays;
import java.util.Scanner;

public class Average_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = sc.nextInt();
            }
            double score = Arrays.stream(arr).average().getAsDouble();
            for (int x : arr) {
                if (x > score) count++;
            }

            double x = (double) count / num * 100;

            System.out.printf("%.3f%%\n",x);
        }
    }
}
