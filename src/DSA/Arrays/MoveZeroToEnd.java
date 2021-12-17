package DSA.Arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 0, 0, 4, 0, 5, 0, 7, 0};

        System.out.println(Arrays.toString(moveZero(arr)));
    }

    static int[] moveZero(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        return arr;
    }
}
