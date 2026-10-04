package arrays.SortingArray;

import java.util.Arrays;

public class Insertion1 {
    public static void main(String[] args) {
        int[] a = {12,13,14,15,11,10,16};
        insertionsort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertionsort(int[] a){
        for(int i =1; i<a.length;i++){
            int pivot = a[i];
            int j =i-1;
            while(j>=0 && a[j]>pivot){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = pivot;
        }
    }
}
