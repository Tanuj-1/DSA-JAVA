package arrays.Day4;

// Ocean view 
public class Q30A {
    public static void main(String[] args) {
        int[] a = {4,2,6,18,5,7,12,6};

        int max = a[a.length-1];
        int count = 1;
        for (int i = a.length-2; i>=0; i--) {
            if(a[i]>max){
                count++;
                max=a[i];
            }
        }
        System.out.println("Total Count of Building Who getting the Ocean View is = " +count);
    }
}
