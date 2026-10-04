package arrays.Seaching.linearsearch;



public class Que2 {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,4,5,4,5,4,5};
        int k = 5;
    
      // System.out.println("Index is "+FirstOccurenece(a, k));
      System.out.println("Total Count of Value is "+CountOccurrences(a, k));
    }
     
    //! Find First Occurrence 

    // public static int FirstOccurenece(int[] a, int k){
    //     for (int i = 0; i < a.length; i++) {

    //     if (a[i] == k) {
    //         return i;
    //     }
    // }

    // return -1;
    // }

    //! Count Occurrences of an Element

    public static int CountOccurrences(int[] a , int k ){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k){
                count++;
            }
        }
        return count;
    }
}
