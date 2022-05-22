package DSA.Hackerrank;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        if(a.length() != b.length()) {
            return false;
        } else {
            for(int i=0; i<a.length(); i++) {
                char ch = a.toLowerCase().charAt(i);
                b = b.toLowerCase();
                System.out.println(ch + " " + b + " " + b.indexOf(ch) + " " + b.replaceFirst(ch+"", ""));
                if(b.indexOf(ch) != -1) {
                    b = b.replaceFirst(ch+"", "");
                } else {
                    return false;
                }
            }
        }

        return b.length() == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}