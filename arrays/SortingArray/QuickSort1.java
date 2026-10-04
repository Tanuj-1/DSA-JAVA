package arrays.SortingArray;

public class QuickSort1 {
     public static void main(String[] args) {  
           int[] a={30, 12, 80, 75, 93, 40, 28, 82};
        quickSort(a, 0, a.length - 1);
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void quickSort(int[] a, int start, int end){
        if(start<end){
            int pivotIndex=partition(a, start, end);
            quickSort(a, start, pivotIndex-1);
            quickSort(a, pivotIndex+1, end);
        }
    }
    public static int partition(int[] a, int start, int end){
        int pivot=a[start];
        swap(a, start, end);
        int i=start-1;
        for(int j=start;j<end;j++){
            if(a[j]<pivot){
                swap(a, ++i, j);
            }
        }
        swap(a, i+1, end);
        return i+1;
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}