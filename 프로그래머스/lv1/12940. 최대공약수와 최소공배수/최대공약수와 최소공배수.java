class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while(min != 0){
            int tmp = max % min;
            max = min;
            min = tmp;
        }
        
        return new int[] {max, n * m / max};
    }
}