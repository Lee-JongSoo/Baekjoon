class Solution {
    boolean solution(String s) {
        char[] c = s.toLowerCase().toCharArray();

        int countP = 0;
        int countY = 0;

        for (char c1 : c) {
            if (c1 == 'p') countP++;
            if (c1 == 'y') countY++;
        }
        
        if (countP == countY) return true;
        else return false;
    }
}