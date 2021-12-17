package Nados.DSA_Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
