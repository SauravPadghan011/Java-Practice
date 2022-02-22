package TCS_Digital.Array;

import java.util.*;

public class Frequency {

    public static void frequency(Integer[] arr) {
        int freq = 1, i=1;
        while(i < arr.length) {
            while(i < arr.length && arr[i]
                    == arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + "=" + freq);
            i++;
            freq = 1;
        }
        if(arr.length == 1 || arr[arr.length-1] != arr[arr.length-2]) {
            System.out.println(arr[arr.length-1] + "=" + 1);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,1,8,3,4,5,5,6,6,6,3,7};

        Arrays.sort(arr);

        frequency(arr);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], Collections.frequency(List.of(arr), arr[i]));
        }

        System.out.println(map);
    }
}
