package recursion;

public class TablePrint {
    public static void main(String[] args) {
        int n = 18;
           Printtable(n, 1);
    }
    public static void Printtable(int n,int i ){
               if(i>10)
                return;
            System.out.println(n+"*"+i+"="+n*i);
            Printtable(n, i+1);
    }
}
