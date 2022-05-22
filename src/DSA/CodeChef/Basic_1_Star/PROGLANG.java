package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class PROGLANG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int A = scan.nextInt();
            int B = scan.nextInt();

            int A1 = scan.nextInt();
            int B1 = scan.nextInt();
            int A2 = scan.nextInt();
            int B2 = scan.nextInt();

            int option  = 0;
            if(A == A1 && B == B1 || A == B1 && B == A1) {
                option = 1;
            } else if(A == A2 && B == B2 || A == B2 && B == A2) {
                option  = 2;
            }
            System.out.println(option);
        }
    }
}
