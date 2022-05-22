package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class SmallestPossibleWholeNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int K = scan.nextInt();

            if (N < K)
                N = N;
            else {
                while (N > 0) {
                    N = N - K;
                    if (N < 0) {
                        N = N+K;
                        break;
                    }
                }
            }
            System.out.println(N);
        }
    }
}
