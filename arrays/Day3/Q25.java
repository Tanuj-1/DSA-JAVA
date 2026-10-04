package arrays.Day3;

// Max consecutive ones 

public class Q25 {
    public static void main(String[] args) {
        int[] a = {1,1,0,1,0,1,1,1,1,0,1};
          
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            
            if(a[i]==1){
                count++;

                if(count > max)
                    max = count;
            }
            else{
                count = 0;
            }
        }
        System.out.println("Max Consecutive Ones is : " +max);
    }
}
