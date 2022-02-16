import java.util.Scanner;

public class Dice_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] == arr[1] && arr[1] == arr[2]) System.out.println(10000 + 1000 * arr[0]);
        else if (arr[0] == arr[1] || arr[1] == arr[2]) System.out.println(1000 + 100 * arr[1]);
        else if (arr[0] == arr[2]) System.out.println(1000 + 100 * arr[0]);
        else System.out.println(Math.max(arr[0], Math.max(arr[1], arr[2])) * 100);
    }
}