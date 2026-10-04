package arrays.Day1;

public class Q20a {
   public static void main(String[] args) {
      int[] a = {10,20,30,40,50,60};
      System.out.println("Original Array");

      for (int i = 0; i <a.length; i++) {
          System.out.print(a[i]+" ");
      }
      int temp = a[1];
      a[1] = a[5];
      a[5] = temp;

         System.out.println("\nSwapped Array:");

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
