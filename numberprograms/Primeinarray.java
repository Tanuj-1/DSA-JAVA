package numberprograms;
import java.util.ArrayList;

public class Primeinarray {
    public static void main(String[] args) {
   
        ArrayList<Integer> prime = new ArrayList<>();
        int number = 2;
        while (prime.size() < 1000) {

            if (isPrime(number)) {
                prime.add(number);
            }
            number++;
        }
        System.out.println(prime);
    }
public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
