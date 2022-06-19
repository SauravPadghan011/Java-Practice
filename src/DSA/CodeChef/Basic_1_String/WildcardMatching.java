package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class WildcardMatching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            String str1 = scan.next();
            String str2 = scan.next();
            boolean result = true;

            for(int i=0; i<str1.length(); i++) {
                boolean equal = false;

                if(str1.charAt(i) == '?' || str2.charAt(i) == '?')
                    equal = true;
                else
                    equal = str1.charAt(i) == str2.charAt(i);

                if (!equal) {
                    result = false;
                    break;
                }
            }
            if(result) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
