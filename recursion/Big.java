package recursion;

public class Big {
    public static void main(String[] args) {
        int x1=12, x2=70, x3=30, x4=50, x5=10;
        int big=big(big(x1, x2), big(big(x3, x4), x5));
        System.out.println("The biggest number is: " + big);

        int max=Math.max(Math.max(Math.max(Math.max(x1, x2), x3), x4), x5);
        System.out.println("The biggest number using Math.max is: " + max);
    }
    public static int big(int a, int b){
        return (a>b)?a:b;
    }
    
}