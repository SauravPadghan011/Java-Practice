package DSA.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(binarySearch(nums, 0, nums.length, 7));
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {
        if(target>nums[nums.length-1]) return nums.length;

        while(start <= end) {
            if(nums[start] == target) return start;
            else {
                int mid = (start+end)/2;
                if(nums[mid] == target) return mid;
                else if (nums[mid]<target) {
                    start = mid+1;
                }
                else if(nums[mid]>target)
                    end = mid-1;
            }
        }
        return start;
    }
}
