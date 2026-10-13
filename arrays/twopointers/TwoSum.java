package arrays.twopointers;

public class TwoSum {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 10, 23, 2};
        int target = 13;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println("index = " + i + " , " + j);
                }
            }   
        }
    }
}
