package Inheritance;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        java.util.Arrays.sort(arr);

        int mid = (arr.length-1)/2;
        int mid1 = ((arr.length-1)/2)+1;
        System.out.println(arr[mid] + arr[mid1]);
    }
}