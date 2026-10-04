package recursion;

public class Factorial {
    
    // ! 1st Way 
    // public static void main(String[] args) {
    //     System.out.println(factorial(5));
    // }
    // public static int factorial(int n ){
    //     if(n==1)
    //         return 1;
    //         return n * factorial(n-1);
    // } 

    //! 2nd Way 
     public static void main(String[] args) {
        System.out.println("Main Method Starts");
        int n = 10;
        try {
            long fact = getfactorial(n);
            System.out.println(n + " = " + fact);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program ends");
    }
    public static long getfactorial(int n) {
        if (n < 0) {
            throw new RuntimeException("-ve numbers are not allowed");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getfactorial(n - 1);
    }
}

