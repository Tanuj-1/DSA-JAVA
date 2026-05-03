package AllRecursion;

public class Q2 {
    public static void main(String[] args) {
        printNum(10);

    }
    public static void printNum(int n ){
        if (n<1)
            return;
       System.out.println(n);
       printNum(n-1);
    }
}
