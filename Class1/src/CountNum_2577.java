import java.util.Scanner;

public class CountNum_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int sum = 1;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            sum *= arr[i];
        }

        int[] answer = new int[10];
        String str = Integer.toString(sum);

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if (sum % 10 == j) answer[j]++;
            }
            sum /= 10;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(answer[i] + " ");
        }
    }
}
