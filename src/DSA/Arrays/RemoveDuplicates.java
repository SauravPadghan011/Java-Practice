package DSA.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 30, 30, 40, 40, 50};

        int result = removeDuplicates(arr);
        for(int i=0; i<result; i++)
            System.out.print(arr[i] + " ");
    }

    static int removeDuplicates(int[] arr) {
        int result = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[result-1]) {
                arr[result] = arr[i];
                result++;
            }
        }
        return result;
    }
}
