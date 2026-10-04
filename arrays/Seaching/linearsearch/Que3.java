package arrays.Seaching.linearsearch;

public class Que3 {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6,7,8,10,23,222,12,33,445};
        
        System.out.println("Max Element is = " +Maxelement(a));
        System.out.println("Min Element is = "+Minelement(a));
    }

    //! Find Max elements 
    public static int Maxelement(int[] a){
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
         return max;
     }
     
     //! Min elements 
    public static int Minelement(int[] a){
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min= a[i];
            }
        }
        return min;
       }
    }
   
