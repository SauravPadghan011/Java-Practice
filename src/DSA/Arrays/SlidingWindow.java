package DSA.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,30,-5,20,50};
        int k=3;

        int max = 0;
        int currSum = 0;
        for(int i=0; i<k; i++) {
            currSum += arr[i];
        }

        max = currSum;

        for(int i=k; i<arr.length; i++) {
            currSum += (arr[i] - arr[i-k]);
            if(currSum > max) {
                max = currSum;
            }
        }

        System.out.println(max);
    }
}
