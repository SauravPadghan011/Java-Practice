package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class WeightBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int w1 = scan.nextInt();
            int w2 = scan.nextInt();
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            int M = scan.nextInt();

            int incW = w2 - w1;
            if(incW >= x1*M && incW <= x2*M)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
