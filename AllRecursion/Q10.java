package AllRecursion;

public class Q10 {
    public static void main(String[] args) {
        int n= 47058;
        printDigit(n);
    }
    public static void printDigit(int n ) {
        if (n==0)
            return;
        printDigit(n/10);
        System.out.println(n%10);
        
    }
}
