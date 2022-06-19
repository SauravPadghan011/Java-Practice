package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class PawriMeme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            String str = scan.next();
            String replaceStr = str.replace("party", "pawri");
            System.out.println(replaceStr);
        }
    }
}
