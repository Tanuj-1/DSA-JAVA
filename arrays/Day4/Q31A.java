package arrays.Day4;

//Missing Number 

public class Q31A {
    public static void main(String[] args) {
        int[] a = {3,0,1};
        int n = a.length;

        int expected = n * (n + 1) / 2;
           int sum = 0;
 
         for(int x : a)
           sum += x;

        System.out.println(expected - sum);
    }
}
