package Nados.DSA_Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int outerSpace = n/2;
        int innerSpace = -1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=outerSpace; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=1; j<=innerSpace; j++) {
                System.out.print("\t");
            }
            if(i>1 && i<n) {
                System.out.print("*\t");
            }


            if(i <= n/2) {
                outerSpace--;
                innerSpace+=2;
            }
            else {
                outerSpace++;
                innerSpace-=2;
            }
            System.out.println();
        }
    }
}
