public class Maxvalue {
    void maxOfArray(){
        int [] arr = {1,2,3,4,5,6,8,};
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("Max " + ans);
    }
    public class main{
        public static void main(String[] args) {
            Maxvalue obj = new Maxvalue();
            obj.maxOfArray();

        }
    }
}
