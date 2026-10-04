package arrays.Day1;

public class Q21D {
    public static void main(String[] args) {
        int[] a = {12, 23, 34};
        int elementSum = 0;
        int digitSum = 0;

        for(int i = 0; i < a.length; i++) {
            elementSum = elementSum + a[i];
            int n = a[i];
            while(n > 0) {
                digitSum = digitSum + n % 10;
                n = n / 10;
            }
        }
        int difference = elementSum - digitSum;

        System.out.println("Element Sum = " + elementSum);
        System.out.println("Digit Sum = " + digitSum);
        System.out.println("Difference = " + difference);
    }
}