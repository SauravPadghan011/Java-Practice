package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class printZ {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int level = sc.nextInt();
        int level = 5;

        // Logic for 1st row
        for(int i=1; i<=level; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(int i=1; i<level-1; i++) {
            // Logic for half triangle spaces
            for (int j=i; j<=level-2; j++) {
                System.out.print(" ");
            }

            // diagonal *
            System.out.print("*");

            // Logic for another half triangle spaces
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Logic for last row
        for(int i=1; i<=level; i++) {
            System.out.print("*");
        }
    }
}
