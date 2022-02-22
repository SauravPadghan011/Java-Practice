package TCS_Digital;

public class RotateArrayClockwise {

    public static int[] Rotate(int[] arr, int rot) {

        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(i < rot) {
                ans[i] = arr[arr.length + i - rot];
            } else {
                ans[i] = arr[i-rot];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rot = 2;

        for(int i=0; i<arr.length; i++) {
            if(i < rot) {
                System.out.print(arr[arr.length + i - rot] + " ");
            } else {
                System.out.print(arr[i - rot] + " ");
            }
        }

        System.out.println();

        int[] newArr = Rotate(arr,  rot);
        for(int i=0; i<newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
