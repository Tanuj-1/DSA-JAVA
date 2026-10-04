package recursion;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Count of Digits is : "+number(123456));
    }
    public static int number(int n){
        if(n==0)
            return 0;
        return 1+number(n/10);
    }
}
