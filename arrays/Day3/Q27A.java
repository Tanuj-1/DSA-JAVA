package arrays.Day3;

// Second Smallest element of an array 

public class Q27A {
    public static void main(String[] args) {
        int[] a = {80, 80, 43, 50, 38, 63, 28, 80};

        int firstsmallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++) {
            if(a[i] < firstsmallest){
              secondsmallest = firstsmallest;
              firstsmallest = a[i];
            }
            else if(a[i]<secondsmallest){
                secondsmallest = a[i];

            }
        }
        System.out.println("Second Smallest = "+secondsmallest);
    }
}
