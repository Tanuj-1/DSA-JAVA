
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle");
        float P = sc.nextFloat();

        System.out.println("Enter rate of interest");
        float r = sc.nextFloat();

        System.out.println("Enter time");
         float t =sc.nextFloat();
         
         float si = (P*r*t)/100;

         System.out.println("principle: "+P);
         System.out.println("rate: "+r);
         System.out.println("time: "+t);

         System.out.println("Simple Interest: "+si);

    }
}