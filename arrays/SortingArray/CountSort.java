package arrays.SortingArray;

public class CountSort {
    public static void main(String[] args) {
        int[] a = {8,5,4,8,-5,10,8,6,-3,2,5};
        countSort(a);
        for(int n:a){
            System.out.print(n+" ");
        }
    }
    public static void countSort(int[] a){
        int min = a[0];
        int max = a[0];
        for(int n:a){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }
     int[] freq = new int[max-min+1];
        for(int n:a){
            freq[n-min]++;
                }
        int j=0;
        for (int i = 0; i < freq.length; i++) {
            while(freq[i]-->0)
                a[j++]=i+min;
               }
          }
    }
    
