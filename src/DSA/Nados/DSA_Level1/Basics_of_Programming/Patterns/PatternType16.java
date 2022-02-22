package DSA.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int space = n-1;
        for(int i=1; i<=n; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print(j+"\t");
            }
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }

            for(int j=1; j<space; j++) {
                System.out.print("\t");
            }
            for(int j=i; j>=1; j--) {
                if(j==n) {
                    j--;
                }
                System.out.print(j+"\t");
            }
            space--;
            System.out.println();
        }
    }
}
