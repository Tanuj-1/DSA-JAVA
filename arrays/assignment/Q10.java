package arrays.assignment;

// Print sum of all odd elements from array.

public class Q10 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i =0; i<a.length-1; i++){
            if(a[i]%2!=0){
                sum = sum +a[i];
            }
        }
        System.out.println(sum);
    }
}
