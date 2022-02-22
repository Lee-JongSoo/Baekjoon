import java.util.Arrays;
import java.util.Scanner;

public class SortingString_1181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < n-1; i++) {
            String com = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j].length() < com.length()) {
                    String tmp = com;
                    com = arr[j];
                    arr[j] = tmp;
                } else if (com.length() == arr[j].length()) {
                    if (com.length() < arr[i].charAt(0)){
                        String tmp = com;
                        com = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
