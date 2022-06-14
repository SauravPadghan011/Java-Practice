package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class HardCash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            long N = scan.nextLong();
            long K = scan.nextLong();

            long[] arr = new long[(int) N];

            for(int i=0; i<N; i++)
                arr[i] = scan.nextLong();

            int sum = 0;
            for(int i=0; i<N; i++)
                sum += arr[i];

            System.out.println(sum%K);
        }
    }
}
