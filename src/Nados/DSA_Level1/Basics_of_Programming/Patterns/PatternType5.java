package Nados.DSA_Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int space = n/2;
        int star = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++) {
                System.out.print("*\t");
            }
            if(i <= n/2) {
                star += 2;
                space--;
            }
            else {
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }
}
