package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class TwoDishes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int count = 0;

            while(true) {
                if(A > 0 && B > 0) {
                    count++;
                    A--;
                    B--;
                } else if(B > 0 && C > 0) {
                    count++;
                    B--;
                    C--;
                } else {
                    break;
                }
            }
            if(count >= N)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
