package arrays.SortingArray;

public class Merge2 {
   public static void main(String[] args) {
        int[] arr1 = {20, 30, 50, 60};
		int[] arr2 = {2, 28, 32, 35, 42};
        int[] merged=merge(arr1, arr2);
        for(int n:merged)
            System.out.print(n+" ");

    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] merged=new int[arr1.length+arr2.length];
        int indx1=0, indx2=0, indx3=0;
        while(indx1<arr1.length && indx2<arr2.length){
            if(arr1[indx1]<=arr2[indx2])
                merged[indx3++]=arr1[indx1++];
            else
                merged[indx3++]=arr2[indx2++];
        }
        while(indx1<arr1.length)
            merged[indx3++]=arr1[indx1++];
        while(indx2<arr2.length)
            merged[indx3++]=arr2[indx2++];
        return merged;
    }
}

