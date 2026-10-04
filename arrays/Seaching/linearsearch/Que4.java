package arrays.Seaching.linearsearch;

//! Element exist or not 

public class Que4 {
    public static void main(String[] args) {
        int[] a = {20,222,11,32,3,2,4,21};
        int target = 10;
       
        System.out.println(Element(a, target));
    }
    public static boolean Element(int[] a , int target){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target){
                return true;
            }
        }
        return false;
    }
}
