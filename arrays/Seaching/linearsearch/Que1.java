package arrays.Seaching.linearsearch;

//! Find an Element in an Array 

public class Que1 {
     public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        int k = 50;
        
        int result = linearsearch(a, k);
        if(result != -1)
        System.out.println("Indexes is "+result );
    else
        System.out.println("element is not found");
     }

     public static int linearsearch (int[] a, int k){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k)
                return i;
        }
         return -1;
     }
}
