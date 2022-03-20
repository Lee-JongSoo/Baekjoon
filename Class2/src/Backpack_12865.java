import java.util.Scanner;

public class Backpack_12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int value = sc.nextInt();
            for (int j = m; j >= weight; j--) {
                dy[j]=Math.max(dy[j], dy[j-weight]+value);
            }
        }
        System.out.println(dy[m]);
    }
}
