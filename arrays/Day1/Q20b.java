package arrays.Day1;

public class Q20b {
    public static void main(String[] args) {
        int[] a = {10,20,9,3,5,6,3,2,100,23,4,32};
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Max = " +max);
        System.out.println("Min = "+min);
    }
}
