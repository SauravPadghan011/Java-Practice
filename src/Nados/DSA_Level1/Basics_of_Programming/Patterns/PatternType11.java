package Nados.DSA_Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int count=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(count++ +"\t");
            }
            System.out.println();
        }
    }
}
