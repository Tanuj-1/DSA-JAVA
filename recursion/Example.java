package recursion;

//By calling method from arguments

public class Example {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int n ){
        if(n>10){
            return;
        }
        System.out.println(n);
        print(n+1);
            }
        }
