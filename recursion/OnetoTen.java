package recursion;

public class OnetoTen {
    public static void main(String[] args) {
        printnumber(1);
    //    PrintNum(1);
    //     System.out.println("================================");
    //  printNum(0);
     
    }

 // !  its for 1 to 10
//     public static void PrintNum(int n) {
//         if (n > 10)
//             return;
//         System.out.println(n);
//         PrintNum(n + 1);
//    }

//!       its for 10 to 1
//     public static void printNum(int n) {
//         if (n > 10)
//             return;
//          printNum(n + 1); 
//         System.out.println(n);
//         printNum(n);
//     }

//! print 1 to 10 or 10 to 1
 public static void printnumber(int n) {
    if (n > 10) {
        System.out.println("========================================");
        return;
    }
    System.out.println(n);
    printnumber(n + 1);
    System.out.println(n);
}
}


