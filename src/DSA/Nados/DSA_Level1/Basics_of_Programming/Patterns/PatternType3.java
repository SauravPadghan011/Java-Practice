package DSA.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=i; j<=(n-1); j++) {
                System.out.print("\t");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
