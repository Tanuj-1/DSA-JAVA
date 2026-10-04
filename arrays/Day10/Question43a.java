package arrays.Day10;

public class Question43a {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1};
        System.out.println(highestFreqArray(arr));
    }
    public static int highestFreqArray(int a[]){
          int small=a[0];
        int big=a[0];
        for(int i=0;i<a.length;i++){
            int e=a[i];
            if(e>big){
                big=e;
            }
            else if(e<small){
                small=e;
            }
        }
        int[] freq=new int[big-small+1];
        for(int n:a){
            freq[n-small]++;
        }
        int maxFreq=0; int element=a[0];
        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                element =i+small;             
            }
        }
        return maxFreq;
    }
}