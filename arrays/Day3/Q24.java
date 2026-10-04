package arrays.Day3;

// Two Sum Leetcode 1 

public class Q24 {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    System.out.println("Index = " + i + ", " + j);
                }
            }
        }
    }
}