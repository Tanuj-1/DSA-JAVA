package arrays.Day6Prefixsum;

public class Q34C {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        int n = a.length;
        int[] result = new int[n];

        // Prefix Product
        int prefix = 1;
        for(int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * a[i];
        }

        // Suffix Product
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * a[i];
        }

        // Print result
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
