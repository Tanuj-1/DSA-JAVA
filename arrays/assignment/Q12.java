package arrays.assignment;

//Print Biggest and Smallest Element of Array.

public class Q12 {
 public static void main(String[] args) {
    int[] a = {10,20,30,40,50,60,70,80,90};

        int biggest = a[0];
        int smallest = a[0];

        for(int i = 1; i < a.length; i++) {
            if(a[i] > biggest) {
                biggest = a[i];
            }
            if(a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println("Biggest = " + biggest);
        System.out.println("Smallest = " + smallest);
 }   
}
