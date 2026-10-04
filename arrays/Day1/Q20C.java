package arrays.Day1;

public class Q20C {
    public static void main(String[] args) {
        String[] a = {"Apple", "Mango", "Banana", "Orange"};
        String largest = a[0];

        for(int i = 1; i < a.length; i++) {
            if(a[i].compareTo(largest) > 0) {
                largest = a[i];
            }
        }
        System.out.println("Largest String = " + largest);
    }
}