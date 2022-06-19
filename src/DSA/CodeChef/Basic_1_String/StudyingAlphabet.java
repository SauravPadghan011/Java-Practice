package DSA.CodeChef.Basic_1_String;

import java.util.HashSet;
import java.util.Scanner;

public class StudyingAlphabet {
    public static HashSet<Character> hashChar = new HashSet<Character>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String known = scan.next();
        for(int i=0; i<known.length(); i++) {
            hashChar.add(known.charAt(i));
        }
        int t = scan.nextInt();

        while(t-- != 0) {
            String str = scan.next();
            if(containChars(str)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean containChars(String str) {
        boolean status = false;
        for(int i=0; i<str.length(); i++) {
            if(hashChar.contains(str.charAt(i)))
                status = true;
        }
        return status;
    }
}