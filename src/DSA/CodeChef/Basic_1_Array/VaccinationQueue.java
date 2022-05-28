package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class VaccinationQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int P = scan.nextInt();
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int[] A = new int[N];
            int totalTime = 0;

            for(int i=0; i<N; i++)
                A[i] = scan.nextInt();

            for(int i=0; i<P; i++) {
                if(A[i] == 0)
                    totalTime += X;
                else
                    totalTime += Y;
            }
            System.out.println(totalTime);
        }
    }
}
