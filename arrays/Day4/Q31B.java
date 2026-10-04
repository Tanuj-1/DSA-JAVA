package arrays.Day4;

public class Q31B {
    public static void main(String[] args) {
        int[] a = {1,3,2};
        for(int i = 0; i < a.length; i++) {
            if(digitSum(a[i]) == i) {
                System.out.println(i);
                break;
            }
        }
    }

    public static int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}