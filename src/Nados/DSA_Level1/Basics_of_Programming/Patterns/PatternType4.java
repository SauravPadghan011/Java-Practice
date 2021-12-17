package Nados.DSA_Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=n; i>=1; i--) {
            for(int j=i+1; j<=n; j++) {
                System.out.print("\t");
            }
            for(int j=i; j>=1; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
