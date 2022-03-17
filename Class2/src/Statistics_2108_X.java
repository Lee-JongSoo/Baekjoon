import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Statistics_2108_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x : arr) {
            hashMap.put(x, hashMap.getOrDefault(x,0) + 1);
        }

       /* ArrayList<Integer> arrayList = new ArrayList<>();

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i])
        }*/

        System.out.println(Math.round(Arrays.stream(arr).average().getAsDouble()));
        System.out.println(arr[n/2]);
        System.out.println(hashMap.values());
        System.out.println(Arrays.stream(arr).max().getAsInt() -
                Arrays.stream(arr).min().getAsInt());
    }
}
