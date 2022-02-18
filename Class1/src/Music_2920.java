import java.util.Scanner;

public class Music_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        String answer = "";

        for (int i = 0; i <= 6; i++) {
            if (arr[i] - arr[i+1] == -1) answer = "ascending";
            else if (arr[i] - arr[i+1] == 1) answer = "descending";
            else {
                answer = "mixed";
                break;
            }
        }
        System.out.print(answer);
    }
}
