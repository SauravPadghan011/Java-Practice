package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class ChefFeedback {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            String str = scan.next();
            if(str.contains("010") || str.contains("101"))
                System.out.println("Good");
            else
                System.out.println("Bad");
        }
    }
}
