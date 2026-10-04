package numberprograms;

public class Countprime {
    public static void main(String[] args) {
        int start = 10;
        int end = 300;

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count = " + count);
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
