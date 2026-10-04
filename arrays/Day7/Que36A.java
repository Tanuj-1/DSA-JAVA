package arrays.Day7;

// Two pointers

public class Que36A {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        Reverse(a);
        for(int n:a)
            System.out.println(n+" ");
        System.out.println("=================================");
        
    }
    public static void Reverse(int[] a){
        int left =0; 
        int right = a.length;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right]=temp;
            left+=1;
            right-=1;
        }
    }
}
