package arrays.Day6Prefixsum;

// Find Pivot 

public class Q34D {
    public static void main(String[] args) {
         int[] a = {1, 7, 3, 6, 5, 6};

         int total = 0;
        // Calculate total sum
        for(int i = 0; i < a.length; i++) {
            total = total + a[i];
        }
        int leftSum = 0;
        for(int i = 0; i < a.length; i++) {
            int rightSum = total - leftSum - a[i];
            if(leftSum == rightSum) {
                System.out.println("Pivot Index = " + i);
                return;
            }
            leftSum = leftSum + a[i];
        }
        System.out.println("No Pivot Index");
    }
}
