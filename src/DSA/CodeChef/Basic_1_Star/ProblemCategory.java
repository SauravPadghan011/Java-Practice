package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class ProblemCategory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int x = scan.nextInt();
            if(x >= 200 && x <= 300)
                System.out.println("Hard");
            else if(x >= 100 && x < 200)
                System.out.println("Medium");
            else if(x >= 1 && x < 100)
                System.out.println("Easy");
        }
    }
}
