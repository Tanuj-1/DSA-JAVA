package Numbersprogram;

import java.util.Scanner;
    public class Q8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start");
		int start=sc.nextInt();
		System.out.println("Enter End");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
				count+=1;
			}
		}
		System.out.println("\nTotal Such Prime Numbers are: "+count);
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
 }