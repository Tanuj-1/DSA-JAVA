package arrays.Day7;

//shift all 0’s to left and all 1’s to the right(Without Sorting).

public class Que39B {
    public static void main(String[] args) {
        int[] a = {0,2,2,1,0,0,1,2,1,0,1,2};
        sort(a);
        for(int n : a) {
            System.out.print(n + " ");
        }
    }
    public static void sort(int[] a) {
        int left = 0;
        int mid = 0;
        int right = a.length - 1;
        while(mid <= right) {
           if(a[mid] == 0){
                int temp = a[left];
                a[left] = a[mid];
                a[mid] = temp;
                left++;
                mid++;
            }
            else if(a[mid] == 1) {
                mid++;
            }
            else {
                int temp = a[mid];
                a[mid] = a[right];
                a[right] = temp;
                right--;
            }
        }
    }
}

