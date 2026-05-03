package Numbersprogram;


    import java.util.Scanner;
    public class Q15palindrome {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start");
		int start=sc.nextInt();
		System.out.println("Enter End");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
			if(isPrime(i) && isPalindrome(i)){
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
	public static boolean isPalindrome(int n){
		int rev=0;	int num=n;
		while(n>0){
			rev=10*rev+n%10;
		n/=10;
		}
	return rev==num;
	}	
}





