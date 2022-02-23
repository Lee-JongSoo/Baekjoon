import java.util.Scanner;

public class Decimal_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m+1];
        int[] arr2 = new int[m+1];

        for (int i = 2; i <= m; i++) {
            if (arr[i] == 0) {
                arr2[i] = i;
                for (int j = i; j <= m; j = j + i) {
                    arr[j] = 1;
                }
            }
        }

        for (int i = n; i <= m; i++) {
            if (arr2[i] !=0) System.out.println(arr2[i]);
        }
    }
}
