package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class SubtaskProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int K = scan.nextInt();

            int[] arr = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = scan.nextInt();

            int passedCases = 0;
            for(int i=0; i<N; i++) {
                if(arr[i] == 1)
                    passedCases++;
            }

            int firstM = 0;
            for(int i=0; i<M; i++) {
                if(arr[i] == 1)
                    firstM++;
            }

            if(passedCases == N)
                System.out.println(100);
            else if(firstM == M)
                System.out.println(50);
            else
                System.out.println(0);
        }
    }
}
