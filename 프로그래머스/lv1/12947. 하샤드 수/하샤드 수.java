class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum =0;
        int sumx = x;
        
        while(sumx > 0) {
            sum += (sumx % 10);
            sumx /= 10;
        }
        
        if (x % sum == 0) answer = true;
        else answer = false;
        
        return answer;
    }
}