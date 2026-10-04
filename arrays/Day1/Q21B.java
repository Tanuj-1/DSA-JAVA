package arrays.Day1;

public class Q21B {
    public static void main(String[] args) {
        // Averge of array

        int[] a = {10,20,30,40};
        int sum = 0;
        for(int i =0; i<a.length; i++){
            sum = sum +a[i];
        }
        double average = (double)sum/a.length;
        System.out.println("Average  = "+average);
    }
    }

