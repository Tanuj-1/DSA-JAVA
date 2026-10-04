package recursion;

// public class ReverseString {
//     public static void main(String[] args) {
//         String s = "hello";
//         char[] a = s.toCharArray();
//         reverse(a, 0, a.length - 1);
//         System.out.println(new String(a));
//     }
//     public static void reverse(char[] a, int start, int end) {
//         if (start >= end)
//             return;
// swap
//         char temp = a[start];
//         a[start] = a[end];
//         a[end] = temp;

// recursion
//         reverse(a, start + 1, end - 1);
//     }
// }

public class ReverseString {
    public static void main(String[] args) {
       String str = "hello";
        char[] s = str.toCharArray();
        reverseString(s);
        System.out.println(new String(s));
    }
     public static  void reverseString(char[] s) {
        int start=0,end=s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
