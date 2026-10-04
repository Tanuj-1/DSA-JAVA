package arrays.Day5;

//Leetcode 188

public class Q33E {
    public static void main(String[] args) {
        int[] prices = {2, 4, 1, 7};
        int k = 2;

        int[] buy = new int[k + 1];
        int[] sell = new int[k + 1];

        for(int i = 0; i <= k; i++) {
            buy[i] = Integer.MIN_VALUE;
        }

        for(int price : prices) {
            for(int t = 1; t <= k; t++) {
                buy[t] = Math.max(buy[t], sell[t - 1] - price);
                sell[t] = Math.max(sell[t], buy[t] + price);
            }
       }
        System.out.println("Maximum Profit = " + sell[k]);
    }
}
