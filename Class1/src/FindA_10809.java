import java.util.Scanner;

public class FindA_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer;
        int cnt;
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i=0; i<str.length(); i++) {
            answer = (int) str.charAt(i) - 97;
            if (arr[answer] != -1) continue;
            arr[(int) str.charAt(i) - 97] += (i+1);
            answer = 0;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
