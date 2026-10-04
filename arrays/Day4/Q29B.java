package arrays.Day4;

   //Sunlight Problem: pr isme index print krana h 

public class Q29B {
    public static void main(String[] args) {
        int[] a ={4,2,6,8,7,12,6};
        int max = Integer.MIN_VALUE;
        int count = 0;

   for(int i = 0; i < a.length; i++) {
         if(a[i] > max) {
        count++;
        max = a[i];
        System.out.println("Index: " + i);
    }
}
System.out.println(" Total Count Of Buildings is = " + count);
    }
}
