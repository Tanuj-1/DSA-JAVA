import java.util.Scanner;

public class Divisibleby3and5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if (n%5==0)
            if(n%3==0) {
          System.out.println("the number is divisible by 5 and 3 both");
            }
            else{
                System.out.println("Not divisible");
            }
        else{
            System.out.println("Not divisible");
        }
        // sc.close(); // Close the scanner to avoid resource leak
    }
}
