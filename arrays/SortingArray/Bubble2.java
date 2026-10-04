package arrays.SortingArray;

public class Bubble2 {
    public static void main(String[] args) {
        int[] a = {8, 6, 9, 2, 4, 5};
        int temp = 0;

        System.out.println("Before Sorting");
        for(int num : a) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println();
            System.out.print("How it is sort ");
        for(int num : a) {
            System.out.print(num + " ");
        }
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int num : a) {
            System.out.print(num + " ");
        }
    }
}

