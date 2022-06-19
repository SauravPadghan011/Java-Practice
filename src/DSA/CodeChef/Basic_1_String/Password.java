package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            String str = scan.next();

            boolean isValid = false, isLower = false, isUpper = false, isNo = false, isSp = false;
            if(str.length() >= 10) {
                for(int i=0; i<str.length(); i++) {
                    char ch = str.charAt(i);
                    if(ch >= 'a' && ch <= 'z')
                        isLower = true;
                    if(i > 0 && i < str.length()-1) {
                        if(ch >= 'A' && ch <= 'Z')
                            isUpper = true;
                        if(ch >= '0' && ch <= '9')
                            isNo = true;
                        if(ch == '@' || ch == '#' || ch == '%' || ch == '&' || ch == '?' )
                            isSp = true;
                    }
                }
                if(isLower && isUpper && isNo && isSp)
                    isValid = true;
            }
            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
