package Numbersprogram;
  
import java.util.Scanner;
    public class Q11sumprime {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start");
		int start=sc.nextInt();
		System.out.println("Enter End");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
			if(isPrime(i) && isPrime(getDigitSum(i))){						
                	System.out.print(i+" ");	
			}
		}
	}
	public static boolean isPrime(int n){
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++){
			if(n%i==0)
				return false;
		}
	return true;
	}
	public static int getDigitSum(int n){
		int sum=0;
		while(n>0){
			sum+=n%10;
		n/=10;
		}
	return sum;
	}
}

