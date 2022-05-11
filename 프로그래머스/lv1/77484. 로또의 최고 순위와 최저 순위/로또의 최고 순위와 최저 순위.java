import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                    break;
                }
            }
        }

        int countZero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) countZero++;
        }


        switch (cnt) {
            case 2:
                answer[1] = 5;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 6:
                answer[1] = 1;
                break;
            default:
                answer[1] = 6;
                break;
        }

        switch (countZero) {
            case 0:
                answer[0] = answer[1];
                break;
            case 1:
                answer[0] = answer[1] - 1;
                break;
            case 2:
                answer[0] = answer[1] - 2;
                break;
            case 3:
                answer[0] = answer[1] - 3;
                break;
            case 4:
                answer[0] = answer[1] - 4;
                break;
            case 5:
                answer[0] = answer[1] - 5;
                break;
            case 6:
                answer[0] = answer[1] - 5;
                break;
            default:
                break;
        }

        return answer;
    }
}
