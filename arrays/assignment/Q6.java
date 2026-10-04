package arrays.assignment;

// Print Average of all elements

public class Q6 {
    public static void main(String[] args) {
        int[] a = {10,20,30,04,50,60,700,800};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
        }
        double average = (double) sum / a.length;
      System.out.println("Average = " + average);
    }
}
