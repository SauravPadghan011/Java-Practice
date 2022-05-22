package DSA.Hackerrank;

import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        Boolean found = false;
        for(int i=0; i<s.length(); i++) {
            int temp = s.charAt(i);
            System.out.print(temp + " ");
            if(temp <= 90 && temp >= 65 || temp >= 97 && temp <= 112) {
                found = true;
                break;
            }
        }

        if(found) {
            String[] str = s.split("[, '@_.?!]+");
            int length = str.length;
            if (str[0].length() == 0 || str[str.length - 1].length() == 0) {
                length--;
            }
            System.out.println(length);

            for(String word: str) {
                if(word.length() != 0)
                    System.out.println(word);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}


