package TCS_Digital.Array;

public class RemoveDuplicates {

    public static int removeDuplicates(Integer[] arr) {
        int res = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,1,8,3,4,5,5,6,6,6,3,7};

        int res = removeDuplicates(arr);

        for(int i=0; i<res; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
