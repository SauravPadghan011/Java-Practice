package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class ChefStock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int S = scan.nextInt();
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            int value = (int) (S*(1+(float)C/100));
            if(value >= A && value <= B)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
