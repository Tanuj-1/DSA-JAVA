package arrays.Seaching.binarysearch;

public class Que2 {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6,7};
          int t = 2;

   System.out.println("Element Insert at this index,index = "+binarysearch(a, t));

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
      return low;
           }
    }

