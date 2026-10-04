package arrays.Day4;

//Sunlight Problem

public class Q29A {
    public static void main(String[] args) {
        int[] a = {4,2,6,8,5,7,12,6};
        int max =  Integer.MIN_VALUE;
        int count = 0;

for(int i = 0; i < a.length; i++) {
    if(a[i] > max) {
        count++;
        max = a[i];
    }
}
System.out.println("Total Count of Building Who Getting the Sunlight View : "+count);
        
    }
}
