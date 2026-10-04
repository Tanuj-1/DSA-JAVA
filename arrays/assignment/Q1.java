package arrays.assignment;

// Access all even index elements from array

public class Q1 {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 7, 8, 25, 30};

      for (int i = 0; i < a.length; i = i + 2) {
         System.out.print(a[i] + " ");
}
    }
}
