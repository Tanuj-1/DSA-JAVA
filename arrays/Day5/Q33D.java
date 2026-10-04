package arrays.Day5;

// Leetcode 123

public class Q33D {
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};

        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;

        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for(int price : prices) {
             
            // first buy and sell
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);

            // Second buy and sell
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }

        System.out.println("Maximum Profit = " + sell2);
    }
    
}
