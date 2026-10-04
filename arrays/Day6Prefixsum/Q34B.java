package arrays.Day6Prefixsum;

public class Q34B {
   public static void main(String[] args) {   
        int[] a = {2,5,4,3,6};

        int total = 0;

        //Total sum calculate krna 
        for(int i=0; i<a.length;i++){
            total = total+a[i];
        }
      // Expect sum of itself
      for (int i = 0; i < a.length; i++) {
          int result = total-a[i];
          System.out.println(result+" ");
      }
    }
}

