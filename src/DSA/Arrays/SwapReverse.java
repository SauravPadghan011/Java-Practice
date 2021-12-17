package DSA.Arrays;

import java.util.Arrays;

public class SwapReverse {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 30, 4, 15, 35, 99};

        int[] digits = new int[]{5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(function(arr1)));
//        int[] digits = new int[]{5,6,2,0,0,4,6,2,4,9};
//        long numberInt = 0;
//        for(int i = 0; i<digits.length; i++) {
//            numberInt = digits[i] + numberInt*10;
//        }
//        numberInt += 1;
//        System.out.println(numberInt);
//
//        // System.out.println(digits.length-1);
//        int lastDigit = 0;
//        for(int i=digits.length-1; i>=0; i--) {
//            lastDigit = (int) (numberInt%10);
//            digits[i] = lastDigit;
//            numberInt = numberInt/10;
//        }
//        System.out.println(Arrays.toString(digits));

//        swap(arr1, 1, 2);
//        System.out.println(Arrays.toString(arr1));
//
//        System.out.println(max(arr1));
//        System.out.println(maxInRange(arr1, 1, 5));
//
//        reverse(arr1);
//        System.out.println(Arrays.toString(arr1));
    }

    static int[] function(int[] digits) {

        for(int i=digits.length-1; i>=0; i--) {
            int num = digits[i];
            if(num<9) {
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArr = new int[digits.length+1];
        newArr[0] = 1;
        return newArr;
    }

    static void swap(int[] arr1, int index1, int index2) {
        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
    }

    static int max(int[] arr1) {
        int max = arr1[0];
        for(int i=1; i<arr1.length; i++) {
            if(arr1[i] > max) max = arr1[i];
        }
        return max;
    }

    static int maxInRange(int[] arr1, int start, int end) {
        int max = arr1[0];
        for(int i=start; i<=end; i++) {
            if(arr1[i] > max) max = arr1[i];
        }
        return max;
    }

    static void reverse(int[] arr1) {
        int start = 0;
        int end = arr1.length-1;
        while(start < end) {
            swap(arr1, start, end);
            start++;
            end--;
        }
    }
}
