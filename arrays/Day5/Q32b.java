package arrays.Day5;

//insert an element at the certain position of the array

public class Q32b {
  public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int position = 2;
        int element = 99;

        int[] b = new int[a.length + 1];

        for(int i = 0; i < position; i++) {
            b[i] = a[i];
        }
        b[position] = element;
        for(int i = position; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
    
}
