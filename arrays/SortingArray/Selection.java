package arrays.SortingArray;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a = {64,34,25,12,22,11,90};
       selectionsort(a);
       System.out.println(Arrays.toString(a));
    }
    public static void selectionsort(int[] a){
        for(int i =0; i<a.length;i++){
            int min =a[i];
            int minindex = i;
            for(int j =i+1; j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    minindex=j;
                }
            }
            a[minindex] = a[i];
            a[i]= min;
        }
    }
}
