package TCS_Digital.Array;

public class MoveZero {

    public static Integer[] moveZero(Integer[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = moveZero(new Integer[]{1,1,0,0,4,5,0,6,0,6,0,0});

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
