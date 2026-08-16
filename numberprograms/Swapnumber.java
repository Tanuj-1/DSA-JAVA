package numberprograms;

public class Swapnumber {
    public static void main(String[] args) {
        int a = 10 , b = 20;
 
    // using third variable 
        // int temp = a;
        //     a = b;
        //     b = temp;

        //     System.err.println("a = "  +a);
        //     System.err.println("b = "   +b);

        

    // without using third variable 
    
    a = a + b;
     b= a-b;
     a = a -b;

   System.err.println("a = "  +a);
   System.err.println("b = "   +b);

        
     


    }
}
