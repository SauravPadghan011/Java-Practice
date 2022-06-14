package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class CollegeLifeGOT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            int noS = scan.nextInt();

            int[] epiIntroLimit = new int[noS];
            for(int i=0; i<noS; i++)
                epiIntroLimit[i] = scan.nextInt();

            long totalTime = 0;
            for(int i=0; i<noS; i++) {
                int noE = scan.nextInt();

                for(int j=0; j<noE; j++) {
                    int epiLen = scan.nextInt();
                    if (j == 0)
                        totalTime += epiLen;
                    else
                        totalTime += (epiLen - epiIntroLimit[i]);
                }
            }
            System.out.println(totalTime);
        }
    }
}
