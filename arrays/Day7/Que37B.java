package arrays.Day7;

// left rotate

public class Que37B {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80};
        leftreverse(a,3);
        for(int n:a){
            System.out.print(n+" ");
        }
    }
    public static void leftreverse(int[] a,int k){
     k%=a.length;
     reverse(a,0, a.length-1);
     reverse(a, 0, a.length-1);
     reverse(a, a.length-k, a.length-1);
    }
    public static void reverse(int[] a,int left,int right){
      //  int left =0; 
       // int right = a.length;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right]=temp;
            left+=1;
            right-=1;
        }
    }
    }

