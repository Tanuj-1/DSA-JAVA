package arrays.assignment;

// Print sum of all even elements from array.

public class Q8 {
     public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90};
        int sum =0;

        for(int i = 0; i< a.length-1; i++){
            if(a[i]%2==0){
                sum = sum+a[i];               
            }
        }
        System.out.println("Sum of All Even element Present in Array = "+sum);
    }
}
