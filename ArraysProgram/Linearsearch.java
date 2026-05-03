public class Linearsearch {
    void searchOfArray(){
        int[] arr ={10,5,3,6,2,8,4,3};
        int x=3;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                ans=i;
                 break;
            }
          }
          System.out.println("Found" + x + "at index " + ans);
   }
    public class main{
        public static void main(String[] args) {
            Linearsearch obj = new Linearsearch();
            obj.searchOfArray();
        }
    }
}
