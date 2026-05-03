
import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int SumofDigits = 0;
        int original_n = n;

        while(n>0){
            SumofDigits += n%10;
            n = n/10;

        }
        System.out.println("Sum of digits in " + original_n + " = " + SumofDigits);
    }
}
