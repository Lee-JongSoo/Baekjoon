import java.util.*;

public class StudyString_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int result = Integer.MIN_VALUE;
        char answer = ' ';

        for (char x : str.toUpperCase().toCharArray()) {
            if ('A' <= x && x <= 'Z') hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        Integer maxValue = Collections.max(hashMap.values());
        int cnt = 0;

        for (char x : hashMap.keySet()) {
            System.out.println(x + " : " + hashMap.get(x));
            if (hashMap.get(x) == maxValue) cnt++;

            if (hashMap.get(x) > result) {
                answer = x;
                result = hashMap.get(x);
            }
        }

        if (cnt >= 2) System.out.print("?");
        else System.out.print(answer);
    }
}
