package arrays.Day3;

//Second distinct biggest element

public class Q26A {
    public static void main(String[] args) {
        int[] a = {80, 80, 43, 50, 38, 63, 58, 80};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > largest) {
                second = largest;
                largest = a[i];
            }
            else if(a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }
        System.out.println("Second Largest = " + second);
    }
}