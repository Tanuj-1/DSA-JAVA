package AllRecursion;

public class Ex3 {
    public static void main(String[] args) {
        printNum(10);
    }

    public static void printNum(int n) {
        if (n < 1) {
            return; // Base Case: stops the recursion
        }
        System.out.println("Before: " + n); // Executes on the way "down"
        printNum(n - 1);                   // Recursive call
        System.out.println("After: " + n);  // Executes on the way "up" (Backtracking)
    }
}

