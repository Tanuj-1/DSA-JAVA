package AllRecursion;

public class Q14tribonacci {
    public int tribonacci(int n ){
        if(n<=1){
            return n;
        } else if(n == 2){
            return 1;
        } else {
            return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        }
    }
}
