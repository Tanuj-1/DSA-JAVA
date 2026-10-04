package patterns;

// A B C D 
// A B C D 
// A B C D 
// A B C D 
// A B C D 

public class Q4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i<=n; i++) {
            for(int j = 1; j<=n; j++){
                System.out.print((char)(j+65)+" ");
            }   
            System.out.println();         
        }
    }
}
