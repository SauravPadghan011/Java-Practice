package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = new int[]{12, 11, 13, 5, 6};
        int[] arr = new int[]{1,2,3,2,5,6};

        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {

        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < first.length && j< second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // add all the remaining element to the array
        while(i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }

        while(j < second.length) {
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;
    }
}
