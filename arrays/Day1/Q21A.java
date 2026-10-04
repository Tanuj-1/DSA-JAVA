package arrays.Day1;

public class Q21A {
    public static void main(String[] args) {
        // sum of all element of array 
        int[] a = {10,20,30,40,50};
        int sum = 0;
        for(int i =0; i<a.length; i++){
            sum = sum +a[i];
        }
        System.out.println("Sum = "+sum);
    }
}
