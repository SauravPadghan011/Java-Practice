package TCS_Digital.String;

import java.util.*;

public class SingleNumberLeetC {

    public static int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }
            else {
                set.remove(nums[i]);
            }
        }
        return set.toArray(new Integer[1])[0];
    }

    public static void main(String []args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}