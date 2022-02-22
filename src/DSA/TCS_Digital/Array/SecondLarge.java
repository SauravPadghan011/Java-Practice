package TCS_Digital.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLarge {
    public static int secondLargest(Integer[] arr) {

        int secondL = -1, largest = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[largest]) {
                secondL = largest;
                largest = i;
            } else if(arr[i] != arr[largest]) {
                if(secondL == -1 || arr[i] > arr[secondL]) {
                    secondL = i;
                }
            }
        }

        return secondL;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{10,14,3,4,15,6,7,8,9,10};

        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);

        list.toArray(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int largest = secondLargest(arr);

        System.out.println("\nSecond Largest: " + arr[largest]+" Index: " + largest);
    }
}
