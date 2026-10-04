package arrays.Day2;
 
// Monotonic Array 
public class Q23A {
    public static void main(String[] args) {
        int [] a = {15,4,3,2,1}; // 
             
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < a.length-1; i++) {
          if(a[i]<a[i+1])
            increasing = false;

          if(a[i]>a[i+1])
            decreasing=false;
        }
        if(increasing || decreasing) 
            System.out.println("Monotonic Array ");      
        else 
            System.out.println("Not Monotonic Array"); 
    }
}
