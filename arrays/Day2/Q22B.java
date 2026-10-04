package arrays.Day2;

public class Q22B {
    public static void main(String[] args) {
        int[] a = {10, 7, 11, 15, 13, 20};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(isPrime(a[i])) {
                if(a[i] < min)
                    min = a[i];
                if(a[i] > max)
                    max = a[i];
            }
        }
        if(min == Integer.MAX_VALUE) {
            System.out.println("No prime number");
        }
        else {
            System.out.println("Difference = " + (max - min));
        }
    }
    public static boolean isPrime(int n) {
        if(n < 2)
            return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}