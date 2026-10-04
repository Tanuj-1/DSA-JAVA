package arrays.SortingArray;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] a={30,12,80,75,93,40,28,82};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
   
    public static void heapSort(int [] a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(a, i, n);
        }
       for(int i = n-1;i>=0;i--){
           swap(a, 0, i);
           heapify(a, 0, i);
            }
    }
    public static void heapify(int[] a,int i,int n){
        int maxIndex=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && a[left]>a[maxIndex]){
            maxIndex=left;
        }
        if(right<n && a[right]>a[maxIndex]){
            maxIndex=right;
        }
        if(i!=maxIndex){
            swap(a, maxIndex, i);
            heapify(a, maxIndex, n);
        }
    }
public static void swap(int[] a,int i,int j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
}
}