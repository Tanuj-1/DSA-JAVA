package arrays.Day5;

 // 33A to 33E ---> Buy and sell stock leetcode questions

//Leetcode -- 121 

public class Q33A {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
          int buy = prices[0],maxProfit=0;
        for(int price:prices ){
            if(price<buy)
            buy = price;
            else if(price-buy>maxProfit)
            maxProfit = price-buy;
         }
       System.out.println(maxProfit);
    }
}
