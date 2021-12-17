package Nados.DSA_Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int space = 0;
        int star = n;
        for(int i=1; i<=n; i++) {
//            System.out.println(space+" "+star);

            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++) {
                if( i > 1 && i <= n/2 && j>1 && j<star) {
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            if (i <= n/2) {
                space++;
                star-=2;
            } else {
                space--;
                star+=2;
            }
            System.out.println();
        }
    }
}
