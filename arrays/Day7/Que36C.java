package arrays.Day7;

public class Que36C{
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60,70,80,90};
        Reverse(a);
        for(int n : a)
            System.out.print(n + " ");

        System.out.println();
        System.out.println("=================================");
    }

    public static void Reverse(int[] a) {
        int mid = a.length / 2;

        // First half reverse
        int left = 0;
        int right = mid - 1;

        while(left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        // Second half reverse
        left = mid;
        right = a.length - 1;
        while(left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}