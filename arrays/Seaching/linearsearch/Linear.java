package arrays.Seaching.linearsearch;

public class Linear {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,7,8,9,19,32,54,56};
        int k = 32;
        int A = LinearSearch(a, k);
        System.out.println("Index number is " +A);
    }
    public static int LinearSearch(int[] a,int k ){
            for (int i = 0; i < a.length; i++) {
                if(a[i]==k)
                    return i;
            }
            return -1;
    }
}
