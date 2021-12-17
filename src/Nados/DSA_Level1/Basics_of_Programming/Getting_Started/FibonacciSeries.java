package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=1) {
            int f0 = 0;
            int f1 = 1;
            int fNext;
            System.out.println(f0);
            System.out.println(f1);

            for(int i=2; i<n; i++) {
                fNext = f0 + f1;
                f0 = f1;
                f1 = fNext;
                System.out.println(fNext);
            }
        }
    }
}
