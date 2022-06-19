package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class SnakeProcession {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            int n = scan.nextInt();
            String str = scan.next();

            str = str.replaceAll("\\.", "");

            if(str.length() == 0)
                System.out.println("Valid");
            else {
                boolean isHead = true, isValid = true;
                for(int i=0; i<str.length(); i++) {
                    if(isHead && str.charAt(i) == 'T') {
                        isValid = false;
                        break;
                    }
                    if(!isHead && str.charAt(i) == 'H') {
                        isValid = false;
                        break;
                    }
                    isHead = !isHead;
                }
                if(!isHead)
                    isValid = false;
                System.out.println(isValid ? "Valid": "Invalid");
            }
        }
    }
}
