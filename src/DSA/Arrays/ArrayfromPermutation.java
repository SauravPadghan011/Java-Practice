package DSA.Arrays;

public class ArrayfromPermutation {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        int j=0;
        for(int i=0; i<nums.length*2; i++) {
            if(i != nums.length) {
                result[i] = nums[j];
            } else {
                j=0;
                result[i] = nums[j];
            }
            j++;
        }
        return result;
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int sum = nums[0];
            for(int j=1; j<=i; j++) {
                sum += nums[j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
//         = new int[nums.length];
        ArrayfromPermutation obj = new ArrayfromPermutation();
        int[] result = obj.runningSum(nums);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
