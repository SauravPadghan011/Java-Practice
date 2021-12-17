package DSA.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(function(digits)));
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
}
