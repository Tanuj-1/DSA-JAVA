package recursion;

public class TowerOfHanoi {

    //! 1st way 
    // public static void towerOfHanoi(int n, char source, char helper, char destination) {
    //     if(n == 1) {
    //         System.out.println("Move disk 1 from " + source + " to " + destination);
    //         return;
    //     }
    //     towerOfHanoi(n - 1, source, destination, helper);
    //     System.out.println("Move disk " + n + " from " + source + " to " + destination);
    //     towerOfHanoi(n - 1, helper, source, destination);
    // }
    // public static void main(String[] args) {
    //     towerOfHanoi(3, 'A', 'B', 'C');
    // }

    //! 2nd way 
   public static void main(String[] args) {
    toh(3, 'A', 'B', 'C');
         }
public static void toh(int n, char s, char aux, char dest) {
    if(n == 1){
        System.out.println("Move disk from " + s + " to " + dest);
        return;
    }
        toh(n-1, s, aux, dest);
        System.out.println("Move disk from " + s + " to " + dest);
        toh(n-1, s, aux, dest);
}
}