package arrays.SortingArray;

// we need key , i , j , i start from idx2 and j start from idx1

public class Insertion2 {
    public static void main(String[] args) {
        int[] a = {5,3,1,2,6,7,8,4};

           for(int i = 1; i<a.length; i++){
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
           }
           for(int num :a){
            System.out.print(num + " ");
           }
    }
}
