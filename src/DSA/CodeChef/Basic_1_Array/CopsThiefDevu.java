package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class CopsThiefDevu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int m = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            int[] cops = new int[m];
            for(int i=0; i<m; i++)
                cops[i] = scan.nextInt();

            int dist = x*y;

            int count = 0;
            for(int i=1; i<= 100; i++) {
                boolean safe = true;
                for(int j=0; j<m; j++) {
                    int leftSide = cops[j] - dist;
                    int rightSide = cops[j] + dist;

                    if(i >= leftSide && i <= rightSide)
                        safe = false;
                }
                if(safe)
                    count++;
            }
            System.out.println(count);
        }
    }
}
