class Solution {
    public int solution(int num) {
        int answer = 0;

        long i = (long) num;

        while (true) {
            if (answer == 500) {
                return -1;
            }
            if (i == 1) {
                break;
            }

            if (i % 2 == 0) {
                i /= 2;
                answer++;
            } else {
                i = (i * 3) + 1;
                answer++;
            }
        }
        return answer;
    }
}