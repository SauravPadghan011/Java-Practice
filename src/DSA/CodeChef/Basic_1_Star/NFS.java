package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class NFS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int U = scan.nextInt();
            int V = scan.nextInt();
            int A = scan.nextInt();
            int S = scan.nextInt();

            if((U*U - 2*A*S) <= V*V)
                System.out.println("YES");
            else
                System.out.println("NO");

//            if(U == S) {
//                System.out.println("YES");
//            } else {
//
//            }
        }
    }
}
