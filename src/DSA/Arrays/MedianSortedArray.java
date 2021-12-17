package DSA.Arrays;

import java.util.Arrays;

public class MedianSortedArray {
    public static void main(String[] args) {
        System.out.println(function());
    }
    static double function() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1,2,3,4,5};
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len1+len2];

        System.arraycopy(nums1,0, result,0,len1);
        System.arraycopy(nums2,0, result, len1, len2);

        Arrays.sort(result);
        int num1 = 0;
        int num2 = 0;
        double ans;
        if(result.length == 1)
            return (double) result[0];
        else if(result.length == 2)
            return (double) (result[0]+result[1])/2;
        else {
            int half = result.length/2;
            if(result.length%2 == 0) {
                num1 = result[half-1];
                num2 = result[half];
                ans = (num1+num2)/(double)2;
            } else {
                num2 = result[half];
                ans = num1+num2;
            }
        }
        return ans;
    }
}
