package arrays.Day4;

public class Q30B {
    public static void main(String[] args) {
        int[] a = {4,2,6,18,5,7,12,6};

        int max = a[a.length - 1];
        int count = 1;
        System.out.println("Index = " + (a.length - 1));

        for (int i = a.length - 2; i >= 0; i--) {
            if(a[i] > max) {
                count++;
                max = a[i];
                System.out.println("Index = " + i);
            }
        }
        System.out.println("Total Count = " + count);
    }
}