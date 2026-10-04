package arrays.Seaching.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        
        int[] a = {5,7,9,11,13};
        int target = 90;

        int result = linearSearch(a,target);
        if(result != -1)
        System.out.println("Indexes is "+result );
    else
        System.out.println("element is not found");
    }

    public static int linearSearch(int[] a , int target){
           for(int i =0; i<a.length;i++){
            if(a[i]==target)
                return i;
           }
           return -1;
    }  
}
