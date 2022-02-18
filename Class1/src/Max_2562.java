import java.util.Arrays;
import java.util.Scanner;

public class Max_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int count = 0;

        for (int i = 0; i < 9; i++) {
            if (arr[i] == max) count = i;
            else continue;
        }
        System.out.println(max);
        System.out.println(count+1);
    }
}
