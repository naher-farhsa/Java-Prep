package study.java;

public class Array {

    public static void find_max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max =arr[i];
                System.out.println("Maximum value is " + max + " at position " + i);
            }
        }

    }

    public static void main(String[] arg) {
        int []arr={345,765,23,89,65};

       find_max(arr);
    }


}
