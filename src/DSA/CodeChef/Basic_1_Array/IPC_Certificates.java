package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class IPC_Certificates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        int count = 0;

        while(N-- != 0) {
            int[] arr = new int[K+1];
            int sum = 0;

            for(int i=0; i<arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            for(int i=0; i<K; i++) {
                sum += arr[i];
            }

            if(sum >= M && arr[arr.length-1]<10)
                count++;
        }
        System.out.println(count);
    }
}
