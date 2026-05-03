package Numbersprogram;


    import java.util.Scanner;
    public class Q10Prime{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start");
		int start=sc.nextInt();
		System.out.println("Enter End");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
			if(isPrime(i)){
				count+=1;
				if(count%2==1)
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
}
    

