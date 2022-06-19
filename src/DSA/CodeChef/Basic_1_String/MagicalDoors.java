package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class MagicalDoors {
    /*
    // This Method will take N^2 time complexity. Which is not suitable as per the constraints.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            String str = scan.next();
            int count = 0;
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == '0') {
                    count++;
                    str = complement(str);
                }
            }
            System.out.println(count);
        }
    }

    static String complement(String str) {
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '1')
                str = str.substring(0, i) + '0' + str.substring(i + 1);
            else
                str = str.substring(0, i) + '1' + str.substring(i + 1);
        }
        return str;
    }
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            String str = scan.next();
            int count = 0;
            if(str.charAt(0) == '0')
                count++;
            for(int i=1; i<str.length(); i++) {
                if(str.charAt(i) != str.charAt(i-1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}


/*
10011 = 01100 = 10011 => (2)
 1         1
101 = 010
 1      1
10001 = 01110
 1          1
010

If we found first digit as 0 then we just have to find non-matching digits and count them
 */