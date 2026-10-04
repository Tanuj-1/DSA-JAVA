package arrays.Day6Prefixsum;

// Tribonacci

public class Q35C {
     public static void main(String[] args) {
        int n = 10;
         int[] a = new int[n];
        gettrib(a);

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void gettrib(int[] a){
       a[0]=0;
       a[1]=1;
       a[2]=2;
       for(int i =3; i<a.length;i++){
        a[i]=a[i-1]+a[i-2]+a[i-3];
       }
    }
}
