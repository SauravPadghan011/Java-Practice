package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class VDATES {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int D = scan.nextInt();
            int L = scan.nextInt();
            int R = scan.nextInt();

            if(D >= L && D <= R)
                System.out.println("Take second dose now");
            else if(D >= L && D > R)
                System.out.println("Too Late");
            else if (D <= L)
                System.out.println("Too Early");
        }
    }
}
