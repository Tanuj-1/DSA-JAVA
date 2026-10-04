package arrays.SortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class Merge1 {
    public static void divide(int[] a, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            // Left half
            divide(a, start, mid);
            // Right half
            divide(a, mid + 1, end);
            // Merge both halves
            merge(a, start, mid, end);
        }
    }
    public static void merge(int[] a, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int index1 = start;
        int index2 = mid + 1;
        int index3 = 0;

        // Compare both halves
        while (index1 <= mid && index2 <= end) {
            if (a[index1] <= a[index2]) {
                merged[index3] = a[index1];
                index1++;
            } else {
                merged[index3] = a[index2];
                index2++;
            }
            index3++;
        }
        // Remaining left elements
        while (index1 <= mid) {
            merged[index3] = a[index1];
            index1++;
            index3++;
        }
        // Remaining right elements
        while (index2 <= end) {
            merged[index3] = a[index2];
            index2++;
            index3++;
        }

        // Copy back
        for (int i = 0; i < merged.length; i++) {
            a[start + i] = merged[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: " + Arrays.toString(a));
        divide(a, 0, a.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(a));
        sc.close();
    }
}