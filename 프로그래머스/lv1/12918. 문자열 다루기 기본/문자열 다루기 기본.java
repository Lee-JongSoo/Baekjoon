public class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (Character c : s.toCharArray()) {
                try {
                    int num = Integer.parseInt(String.valueOf(c));
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }
        else {
            answer = false;
        }
        return answer;
    }
}
