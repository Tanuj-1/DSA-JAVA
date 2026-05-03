public class CWONETOFIVE{
    static void printIncreasing( int n ){
        int n = 5;
        if(n == 1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}