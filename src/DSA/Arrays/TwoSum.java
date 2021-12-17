package DSA.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[]{2, 7, 11, 15};
//        int[] arr1 = new int[]{-1,-2,-3,-4,-5};
//        int[] arr1 = new int[]{3,2,3};
        int target = scan.nextInt();

        int[] result = findTarget(arr1, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] findTarget(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> hash= new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            int diff = target-nums[i];
            if(hash.containsKey(diff)) {
                result[0] = hash.get(diff);
                result[1] = i;
            }
            hash.put(nums[i], i);
        }
        return result;
    }
}