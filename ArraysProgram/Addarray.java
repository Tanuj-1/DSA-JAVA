public class Addarray {
    void sumOfArray(){
        int[] arr = {1,3,5};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
     System.out.println(sum);
    }
    public class Main{
        public static void main(String[] args) {
            Addarray obj = new Addarray();
            obj.sumOfArray();
        }
    }
}

// o/p :- 9 
