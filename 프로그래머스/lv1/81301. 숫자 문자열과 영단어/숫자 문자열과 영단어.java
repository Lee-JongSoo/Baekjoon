import java.io.*;


class Solution {
    static String[] numbers ={"zero", "one", "two", "three", 
                                "four", "five", "six", 
                                "seven", "eight", "nine"};
    
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < numbers.length; ++i){
            s = s.replaceAll(numbers[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}