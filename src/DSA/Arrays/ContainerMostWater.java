package DSA.Arrays;

public class ContainerMostWater {
    public static void main(String[] args) {
        System.out.println(function());
    }

    static int function() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        int minHeight = height[0];
        int maxHeight = height[height.length-1];
        int minInd = 0;
        int maxInd = height.length-1;

        int ans=0;

        if(maxHeight < minHeight) {
            minHeight = maxHeight;
            minInd = maxInd;

            maxHeight = height[0];
            maxInd = 0;
        }

        int width = height.length-1;
        int maxArea = minHeight*width;

        while(width>0) {
            int index = minInd;
            while(height[index] <= minHeight) {
                if(minInd < maxInd)
                    index++;
                else
                    index--;
            }
        }


        return ans;
    }
}
