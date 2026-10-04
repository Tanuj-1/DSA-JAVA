package arrays.assignment;

// Access all even elements from array and also count even 

public class Q2 {
    public static void main(String[] args) {
         int[] a = {1,2,3,4,5,6,7,8,9,10};
         int count = 0;

         for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                count++;
                System.out.println(a[i]+" ");
            }             
         }
         System.out.println("count " +count);
    }
}
