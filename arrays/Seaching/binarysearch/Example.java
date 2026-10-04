package arrays.Seaching.binarysearch;

// Without Recursion example 

public class Example {
    public static void main(String[] args) {
        int [] a = {10,12,14,35,40,45,47,50,60,65};
        int key = 50;
        int index = binarysearch(a, key);
        if(index>=0){
            System.out.println("Element is found at index : "+index);
        }else{
            System.out.println("No such elemeny is available");
        }
    }
    public static int binarysearch(int[] a,int key) {
         int left =0 ,right = a.length-1;
         while (left<=right) {
            int mid = left+(right-left)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]>key)
                right=mid-1;
            else
             left=mid+1;
         }
        return -1;
    }
}
