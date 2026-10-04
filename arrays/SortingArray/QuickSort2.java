package arrays.SortingArray;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] a = {6, 3, 8, 222, 7, 11, 50, 4};

        System.out.println("Before Sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        quickSort(a, 0, a.length - 1);

        System.out.println();
        System.out.println("After Sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int[] a, int low, int high) {
        if(low<high){
            int pi = partition(a, low, high);

            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }
    public static int partition(int[] a, int low, int high) {
                  int pivot = a[high];
                  int i = low-1;

                  for(int j=low;j<high;j++){
                    if(a[j]<pivot){
                        i++;
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                  }
       int temp = a[i+1];
       a[i+1] = a[high];
       a[high] = temp;

       return i+1;
    }
}
