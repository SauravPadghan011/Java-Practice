package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class DistinctPairSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            System.out.println((R*2 - L*2)+1);
        }
    }
}
