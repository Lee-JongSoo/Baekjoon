import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Statistics_2108 {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
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

        int[] arr2 = new int[n];
        int answer = 0;
        for (int x : hashMap.keySet()) {
            if (hashMap.get(x) < min) answer = hashMap.get(x);
            else if (hashMap.get(x) == answer) return;
        }


        System.out.println((int)Arrays.stream(arr).average().getAsDouble());
        System.out.println(arr[n/2]);
        System.out.println();
        System.out.println(Arrays.stream(arr).max().getAsInt() -
                Arrays.stream(arr).min().getAsInt());
    }
}
