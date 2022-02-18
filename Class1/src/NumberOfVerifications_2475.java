import java.util.Scanner;

public class NumberOfVerifications_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += (int) Math.pow(arr[i], 2);
        }
        System.out.println(sum % 10);
    }
}
