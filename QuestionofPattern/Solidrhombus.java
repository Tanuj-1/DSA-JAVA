package QuestionofPattern;

public class Solidrhombus {
    public static void main(String[] args) {

        int n = 10;
        for(int i =1; i<=n; i++){

            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //start
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
    
}
