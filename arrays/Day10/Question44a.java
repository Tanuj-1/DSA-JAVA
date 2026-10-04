package arrays.Day10;

public class Question44a {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,1,3,4,2,4,5,6};
        int b=firstnonrepeating(a);
        System.out.println(b);
    }
    public static int firstnonrepeating(int[] a){
        int max=a[0]; 
        int min = a[0];
              for(int n:a){
                if(n>max)
                    max=n;
                else if(n<min)
                    min=n;
              }
              int[] freq = new int[max-min+1];
              for(int i : a){
                freq[i-min]++;
              }
              for(int i:a){
                if(freq[i-min]==1)
                    return i;              
              }
        
        throw new RuntimeException("No such element found");
            }
}
