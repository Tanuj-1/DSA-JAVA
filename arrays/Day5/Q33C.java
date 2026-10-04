package arrays.Day5;

// Leetcode 714

public class Q33C {
    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        int n = prices.length;
        int[] buy = new int[n];
        int[] sell = new int[n];
        buy[0] = -prices[0]; // buy on day 0
        sell[0] = 0;         // no stock on day 0
        for (int i = 1; i < n; i++) {
            // either keep holding OR buy today
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            // either keep not holding OR sell today (pay fee)
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee);
        }
       // Print sell array
        for (int i = 0; i < n; i++) {
            System.out.print(sell[i] + " ");
        }

        System.out.println();

        // Maximum profit
        System.out.println("Maximum Profit = " + sell[n - 1]);
        
        }
    }

