import java.util.HashMap;
import java.util.Scanner;

public class FindN_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int find = sc.nextInt();
            hashMap.put(find, hashMap.getOrDefault(find, 0) + 1);
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n2 = sc.nextInt();
            if (hashMap.containsKey(n2)) System.out.println(1);
            else System.out.println(0);
        }
    }
}
