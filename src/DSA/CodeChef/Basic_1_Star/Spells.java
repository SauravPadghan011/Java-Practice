package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class Spells {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            // Formula to Calculate Addition of large and second large element
            System.out.println(A + B + C - Math.min(A, Math.min(B, C)));
        }
    }
}
