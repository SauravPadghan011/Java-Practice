package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class MaxDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int S = scan.nextInt();

            if(S <= N)
                System.out.println(S);
            else
                System.out.println(N*2 - S);
        }
    }
}
