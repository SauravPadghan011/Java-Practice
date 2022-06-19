package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class HiringTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            String result = "";

            while(n-- != 0) {
                String str = scan.next();
                int f = 0, u = 0, p = 0;
                for(int i=0; i<str.length(); i++) {
                    if(str.charAt(i) == 'F')
                        f++;
                    else if(str.charAt(i) == 'U')
                        u++;
                    else
                        p++;
                }

                if(f >= x || (f == (x-1) && p >= y) )
                    result += '1';
                else
                    result += '0';
            }
            System.out.println(result);
        }
    }
}
