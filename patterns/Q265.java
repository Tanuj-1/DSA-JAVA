package patterns;

public class Q265 {
    public static void main(String[] args) {
        int n=7;
        printPattern(n);
    }
    public static void printPattern(int n){
        if(n%2==0){
            System.out.println("Pattern is NOT Possible!");
            return;
        }
        int mid=n/2+1;
        int startSpace=n/2;
        int endStar=5*n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=mid;j++){//Part-1
                if(j<=startSpace)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for(int j=mid+1;j<=n+1;j++){//Part-2
                    if(i==1 || j==n+1 && i<=mid)
                        System.out.print("@ ");
                    else
                        System.out.print("  ");
            }
             for(int j=n+2;j<=2*n-1;j++){//Part-3
                    if(i>mid)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
            }
            for(int j=2*n;j<=5*n/2;j++){//Part-4
                    if(i==1 || j==2*n && i<=mid)
                        System.out.print("@ ");
                    else
                        System.out.print("  ");
            }
            for(int j=5*n/2+1;j<=endStar;j++){//Part-5
                    System.out.print("* ");
            }
            if(i<mid){
                startSpace--;   endStar++;
            }else{
                startSpace++;   endStar--;
            }
            System.out.println();
        }
    }
}
