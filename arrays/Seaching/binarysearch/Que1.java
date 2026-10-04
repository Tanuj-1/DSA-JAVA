package arrays.Seaching.binarysearch;

public class Que1 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80};
        int t = 50;

   System.out.println("Element found at this index,index = "+binarysearch(a, t));
    }
    public static int binarysearch(int[] a, int t ){
        int low = 0;
        int high = a.length-1;

      while(low<=high){
        int mid = low+(high-low)/2;

        if(a[mid]==t){
            return mid;

        }
        else if(a[mid]<t){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return -1;
           }
}

