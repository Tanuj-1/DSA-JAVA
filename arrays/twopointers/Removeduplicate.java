package arrays.twopointers;

public class Removeduplicate {
    public static void main(String[] args) {
    int[] a = {1, 1, 2, 2, 3, 3, 4};
    int low = 0;
    int count = 1;
    int n = a.length;

    while (count < n) {
        if (a[count] != a[low]) {
            low++;
            a[low] = a[count];
        }
        count++;
    }
    int res = low + 1;
    System.out.println("Unique count: " + res);
    for (int i = 0; i < res; i++) {
        System.out.print(a[i] + " ");
          }
      }
}
