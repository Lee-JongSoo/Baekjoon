import java.util.Arrays;
import java.util.Collections;

public class Solution {
     public long solution(long n) {
        long answer = 0;

        String str = Long.toString(n);
        String[] strings = str.split("");

        Arrays.sort(strings, Collections.reverseOrder());
        String tmp = String.join("", strings);

        return Long.parseLong(tmp);
    }
}