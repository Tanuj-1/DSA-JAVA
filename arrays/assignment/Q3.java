package arrays.assignment;

// Access all elements of array from end

public class Q3 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
          for(int i = a.length-1; i>=0; i--){
            System.out.println(a[i]);
          }
    }
}
