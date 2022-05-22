package DSA.TCS_Digital.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Largest {

    static int largest(Integer[] arr) {
        int lastInd = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr[lastInd])
                lastInd = i;
        }

        return lastInd;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{10,10,3,4,10,6,7,8,9,10};

        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);

        list.toArray(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int largest = largest(arr);

        System.out.println("\n" + arr[largest]+" Index: " + largest);
    }
}
