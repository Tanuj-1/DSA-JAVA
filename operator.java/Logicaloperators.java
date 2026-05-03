public class Logicaloperators {
    public static void main(String[] args) {
        int a=15, b=10, c=5;
  
        //&& opr 
         System.out.println((a>b)&&(a>c));//T
         System.out.println((a>b)&&(a<c));//F

         //|| opr
         System.out.println((c>b)||(a<b));//T
         System.out.println((a>b)||(b>c));//T
         System.out.println((a<b)||(b<c));//F

         // !  opr
         System.out.println(!(a==b));//T
         System.out.println(!(a > b));//F
    }

    
}
