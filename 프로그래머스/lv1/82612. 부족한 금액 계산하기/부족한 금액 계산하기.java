class Solution {
    public long solution(int price, int money, int count) {
         long priceSum = 0;

        for (long i = 1; i <= count; i++) {
            priceSum += price * i;
        }

        System.out.println(price);
        if (money > priceSum) {
            return 0;
        }
        return priceSum - money;
    }
}