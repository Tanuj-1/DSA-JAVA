package string.Easy;

public class Q1 {
    public static void main(String[] args) {
        String str = "java";
                 
        //! for loop 
        // for(int i =0; i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }

        //!  for each loop 
        char[] arr= str.toCharArray(); // first wee  convert string to char 
        for(char ch : arr){
            System.out.print(ch+" ");
        }
    }
}
