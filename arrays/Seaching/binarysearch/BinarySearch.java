package arrays.Seaching.binarysearch;

// With Recursion

public class BinarySearch {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        // Base condition
        if (low > high) {
            return -1;
        }
        // Find middle
        int mid = low + (high - low) / 2;
        // Target found
        if (arr[mid] == target) {
            return mid;
        }
        // Target is on right side
        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);
        }
        // Target is on left side
        return binarySearch(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}