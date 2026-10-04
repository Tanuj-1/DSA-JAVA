package arrays.sortingarray;

public class Selection1 {
    public static void main(String[] args) {
        int[] a = {6,5,2,8,3,9,4};
                
        System.out.println("Before Sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        selectionsort(a);

        System.out.println();
        System.out.println("After Sorting:");

        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    //!  using technique find min and shift in starting of array 

    // public static void selectionsort(int[] a){
    //     for (int i = 0; i < a.length; i++) {

    //     int min = i;
    //    for(int j =i+1; j<a.length; j++){
    //       if(a[j]<a[min]){
    //         min = j;
    //           }
    //         }
             // swap
    //     int temp = a[i];
    //     a[i]=a[min];
    //     a[min]=temp;
    //     }

    // }

    //! using technique to find max and swap it in last of array 

public static void selectionsort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {

        int max = 0;

        for (int j = 0; j < a.length - 1 - i; j++) {
            if (a[j] > a[max]) {
                max = j;
            }
        }

        // Maximum ko end mein swap
        int temp = a[max];
        a[max] = a[a.length - 1 - i];
        a[a.length - 1 - i] = temp;
        }
  }
}
