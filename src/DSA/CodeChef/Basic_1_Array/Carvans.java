package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class Carvans {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            int n = scan.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<arr.length; i++)
                arr[i] = scan.nextInt();

            int collCount = 0;
            int min = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] <= arr[min])
                    collCount++;
                if(arr[i] < arr[min])
                    min = i;
            }
            System.out.println(collCount);
        }
    }
}
