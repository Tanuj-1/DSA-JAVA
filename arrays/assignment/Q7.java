package arrays.assignment;

// Print and count elements bigger than average

public class Q7 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50,80};
           int sum = 0;

      for (int i = 0; i < a.length; i++) {
           sum = sum + a[i];
}
      double average = (double) sum / a.length;
            int count = 0;

      for (int i = 0; i < a.length; i++) {
           if (a[i] > average) {
        System.out.print(a[i] + " ");
        count++;
    }
}
System.out.println();
System.out.println("Count = " + count);
    }
}
