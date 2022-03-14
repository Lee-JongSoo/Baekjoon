import java.util.Scanner;

public class A_2960 {
    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];
        int count = 0;

        for(int i = 2; i <= n; i++) {
            arr[i] = 1;
        }

        for(int i = 2; i <= n; i++) {
            for(int j = i; j <= n; j += i) {
                if(arr[j] != 1) continue;
                arr[j] = 0;
                count ++;
                if(count == k) {
                    System.out.println(j);
                    System.exit(0);
                }
            }
        }
    }
}