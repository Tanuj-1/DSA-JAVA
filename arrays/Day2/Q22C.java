package arrays.Day2;

public class Q22C {
    public static void main(String[] args) {
        int[] a = {121, 23, 44, 56, 101};
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if(isPalindrome(a[i])) {
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println("Count = " + count);
    }
    public static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;
        while(n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return original == rev;
    }
}