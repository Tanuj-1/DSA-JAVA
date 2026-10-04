package arrays.assignment;

// print and count all three-digit numbers from array.

public class Q4 {
    public static void main(String[] args) {
       int[] a = {10, 125, 45, 678, 99, 321, 1000};
         int count = 0;

    for (int i = 0; i < a.length; i++) {
    if (a[i] >= 100 && a[i] <= 999) {
        System.out.print(a[i] + " ");
        count++;
              }
       }
        System.out.println();
         System.out.println("Count = " + count);
    }
}
