package AllRecursion;

public class Ex4 {
    
    public static void main(String[] args) {
    int sum = getsum(5);
    System.out.println(sum);
}

public static int getsum(int n) {
    if (n == 1) {
        return 1; // Base case
    }
    return n + getsum(n - 1); // Recursive call
}    

    }


