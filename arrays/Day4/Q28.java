package arrays.Day4;

public class Q28 {
    public static void main(String[] args) {
       int[] a = {2,2,3,1};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

for(int x : a) {
    if(x == first || x == second || x == third)
        continue;
    if(x > first) {
        third = second;
        second = first;
        first = x;
    } else if(x > second) {
        third = second;
        second = x;
    }else if(x > third) {
        third = x;
    }
}
System.out.println(third);
    }
}
