package string.Easy;

public class Q2 {
    public static void main(String[] args) {
        String str = "java";

        // find length 
        System.out.println(str.length());

        System.out.println();
        
        // print every element
        for(char ch : str.toCharArray()){
            System.out.println(ch);
        }
    }
}
