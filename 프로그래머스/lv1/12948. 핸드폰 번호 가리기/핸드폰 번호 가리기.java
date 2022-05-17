class Solution {
    public String solution(String phone_number) {
        String[] str = phone_number.split("");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length(); i++) {
            sb.append(str[i]);
        }

        String count = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            count += "*";
        }

        sb.replace(0, phone_number.length() - 4, count);
        return sb.toString();
    }
}