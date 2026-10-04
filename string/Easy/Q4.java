package string.Easy;

public class Q4 {
    public static void main(String[] args) {
        String str = "educationbcv";
        int count = 0;

        //   //! For Vowels 
        // for(char ch:str.toCharArray()){
        //     if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println("Total Vowels count is = "+count);

        //! For Consonants
        for(char ch:str.toCharArray()){
           if((ch >= 'a' && ch <= 'z') && 
                 !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                  count++;
            }
    }
    System.out.println("Total Consonats = "+count);
}
}
