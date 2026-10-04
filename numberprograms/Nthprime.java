package numberprograms;

public class Nthprime {
    public static void main(String[] args) {
        int n = 55;

        int count = 0;
        int number =1;

        while (count <n){
            number++;
            if(isPrime(number)){
                count++;
            }
        }
         System.out.println("Nth Prime = " + number);
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
