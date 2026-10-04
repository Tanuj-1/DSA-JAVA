package arrays.assignment;

public class Q5 {
    public static void main(String[] args) {
        int[] a = {100,200,30,40,500};
        int sum = 0 ;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];            
        }
        System.out.println("sum = "+sum);
    }
}
