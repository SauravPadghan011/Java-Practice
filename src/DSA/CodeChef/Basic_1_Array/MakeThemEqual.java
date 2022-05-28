package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class MakeThemEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int[] arr = new int[N];

            for(int i=0; i<N; i++)
                arr[i] = scan.nextInt();

            int large = 0;
            for(int i=1; i<N; i++) {
                if (arr[i] > arr[large])
                    large = i;
            }

            int ans = 0;
            for(int i=0; i<N; i++)
                ans = Math.max(ans, arr[large] - arr[i]);

            System.out.println(ans);
        }
    }
}
