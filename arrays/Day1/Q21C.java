package arrays.Day1;

public class Q21C {
    public static void main(String[] args) {
        //Average of elements at even index
        int[] a = {10, 20, 30, 40, 50};

        int sum = 0;
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                sum = sum + a[i];
                count++;
            }
        }
        double average = (double) sum / count;

        System.out.println("Average = " + average);
    }
    }

