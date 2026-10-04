package arrays.SortingArray;

public class Bubble1 {
    public static void main(String[] args) {
        int[] a = {8, 6, 9, 2, 4, 5};

        System.out.println("Before Sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        bubbleSort(a);
        System.out.println();
        System.out.println("After Sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;
                }
            }
            // Agar koi swapping nahi hui,
            // array already sorted hai
            if (flag) {
                break;
            }
        }
    }
}