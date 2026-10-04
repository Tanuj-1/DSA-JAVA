package arrays.Day6Prefixsum;
 
// nth term fib

public class Q35A {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        getfib(a);

       // System.out.println(a[3]);

       for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
     public static void getfib(int[] a) {
        a[0] = 0;
        a[1] = 1;
        for(int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
    }
}