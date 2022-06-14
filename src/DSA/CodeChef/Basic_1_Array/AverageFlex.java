package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class AverageFlex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int n = scan.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<arr.length; i++)
                arr[i] = scan.nextInt();

            // 10 10 5 80 80 80
            int boast = 0;
            for(int i=0; i<n; i++) {
                int lessThan = 0;
                int greaterThan = 0;

                for(int j=0; j<n; j++) {
                    if(arr[j] > arr[i] && i != j)
                        greaterThan++;
                    else if(arr[j] <= arr[i] && i != j) {
                        lessThan++;
                    }
                }

                /*
                Check whether a current element will boast or not.
                If he satisfies the condition then he will boast and boast counter will inc by 1
                 */
                if (lessThan >= greaterThan)
                    boast++;
//                System.out.println(arr[i] + " " + boast);
            }
            System.out.println(boast);
        }
    }
}
