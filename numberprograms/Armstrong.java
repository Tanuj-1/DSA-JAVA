package numberprograms;

// public class Armstrong {
//     public static void main(String[] args) {
//         int n = 321;
//         int temp = n;
//         int r,sum = 0;
//         while(n>0){
//             r = n%10;
//             n = n/10;
//             sum = sum+ r*r*r;
//         }
//         if (temp == sum )
//             System.out.println("It is an Armstrong number ");
//         else
//             System.out.println("Not Armstrong ");
//         }
//     }
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}

