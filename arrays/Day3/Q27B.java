package arrays.Day3;

public class Q27B {
    public static void main(String[] args) {
       int[] a = {80, 80, 43, 50, 38, 63, 38, 80};

       int firstSmallest = Integer.MAX_VALUE;
       int secondsmallest = Integer.MAX_VALUE;

       for(int i =0; i<a.length;i++){
        if(a[i]<firstSmallest){
           secondsmallest = firstSmallest;
           firstSmallest = a[i];
        }
        else if(a[i]<secondsmallest && a[i]!=firstSmallest){
            secondsmallest = a[i];
        }
       }
       System.out.println("Second Distinct Smalllest = "+secondsmallest);
    }
}
