package arrays.Day5;

// Leetcode 122

public class Q33B {
    public static void main(String[] args) {
         int[] prices = {7,1,5,3,6,4};
          int totalProfit =0;
        for(int i = 1 ; i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                totalProfit += (prices[i]-prices[i-1]);
            }
        }
        System.out.println(totalProfit);
    }
}
