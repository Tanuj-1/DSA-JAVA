import java.util.Scanner;

public class Streamofnum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum=0;

            while(num!=1){
                sum+=num;
                num=sc.nextInt();


            }
            System.out.println(sum);
        }
        }
    }
    

