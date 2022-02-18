import java.util.Arrays;
import java.util.Scanner;

public class Sum_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            char[] x = str.toCharArray();
            arr[i] = Character.getNumericValue(x[i]);
        }

        System.out.println(Arrays.stream(arr).sum());
    }
}
