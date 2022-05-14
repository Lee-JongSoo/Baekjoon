import java.util.Arrays;

class Solution {
     public int[] solution(int[] arr) {

        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int min = Arrays.stream(arr).min().getAsInt();

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            answer[index++] = arr[i];
        }

            return answer;
    }
}