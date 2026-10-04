package arrays.assignment;

// Print sum of all elements divisible by 3.

public class Q11 {
   public static void main(String[] args) {
    int[] a = {10,20,30,40,50,60,70,80,9};
    int sum = 0;
    for(int i =0; i<a.length-1; i++){
        if(a[i]%3==0){
            sum = sum+a[i];
        }
    }
    System.out.println("Sum of divisible by 3 = " +sum);
   } 
}
