import java.util.Arrays;
import java.util.Scanner;

public class Average_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double max = Arrays.stream(arr).max().getAsDouble();

        for (int i = 0; i < n; i++) {
            if (arr[i] <= max) {
                arr[i] = (arr[i] / max) * 100;
            }
        }
        double result = Arrays.stream(arr).sum() / n;
        System.out.println(result);
    }
}
