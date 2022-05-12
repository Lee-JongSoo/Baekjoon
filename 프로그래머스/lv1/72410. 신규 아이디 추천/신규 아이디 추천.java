public class Solution {
    public String solution(String new_id) {
        char[] chars = new_id.toLowerCase().toCharArray();

        String answer = "";

        for (char c : chars) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                answer += (c);
            }
        }



        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        if (answer.length() > 0 && answer.charAt(0) == '.') {
            answer = answer.substring(1, answer.length());
        }

        if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        if (answer.equals("")) {
            answer = "a";
        }

        if (answer.length() > 15) {
            answer = answer.substring(0, 15);

            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        if (answer.length() <= 2) {
            char c = answer.charAt(answer.length() - 1);

            while (answer.length() < 3) {
                answer += c;
            }
        }

        return answer;
    }
}
