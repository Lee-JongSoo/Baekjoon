import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        int sum = 0;

        for (int integer : d) {
            if (budget > sum) {
                sum += integer;
                if (budget < sum) break;
                answer++;
            }
        }

        return answer;
    }
}