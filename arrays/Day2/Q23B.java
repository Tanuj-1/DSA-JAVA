package arrays.Day2;

public class Q23B {
     public static void main(String[] args) {
        int[] coins = {100,50,10,5,2,1};
        int amount = 578;

        for (int i = 0; i < coins.length; i++) {
            int count = amount/coins[i];
            System.out.println(coins[i] + " -> " +count);
            amount = amount % coins[i];
        }
     }
}
