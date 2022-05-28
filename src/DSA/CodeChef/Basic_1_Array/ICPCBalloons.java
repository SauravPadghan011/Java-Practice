package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            int[] hash = {0,0,0,0,0,0,0};
            int count = 0;

            int N = scan.nextInt();
            int[] arr = new int[N];

            for(int i=0; i<N; i++)
                arr[i] = scan.nextInt();

            for(int i=0; i<N; i++) {
                if(arr[i] <= 7)
                    hash[arr[i]-1] = 1;
                count++;
                if(hasAll(hash)) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }

    private static boolean hasAll(int[] hash) {
        int count = 0;
        for(int i=0; i < hash.length; i++) {
            if(hash[i] == 1)
                count++;
        }
        return count == 7;
    }
}
