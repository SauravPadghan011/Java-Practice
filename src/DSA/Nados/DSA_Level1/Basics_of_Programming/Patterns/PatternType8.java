package DSA.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i+1; j--) {
                System.out.print("\t");
            }
            System.out.println("*\t");
        }
    }
}
