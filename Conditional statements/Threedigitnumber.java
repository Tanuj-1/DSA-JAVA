
import java.util.Scanner;

public class Threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        if (n>99 && n<1000) {
            System.out.println("This is three digit number ");
            
        }
        else{
            System.out.println("This is not three digit number ");
        }
    }
    
}
