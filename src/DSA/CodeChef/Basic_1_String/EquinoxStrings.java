package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class EquinoxStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t--  != 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();

            long pointsSarth = 0, pointsAni = 0;
            for(int i=0; i<n; i++) {
                String str = scan.next();
                char ch = str.charAt(0);
                if(ch == 'E' || ch == 'Q' || ch == 'U' || ch == 'I' || ch == 'N' || ch == 'O' || ch == 'X')
                    pointsSarth += a;
                else
                    pointsAni += b;
            }
            if(pointsSarth > pointsAni)
                System.out.println("SARTHAK");
            else if(pointsSarth < pointsAni)
                System.out.println("ANURADHA");
            else
                System.out.println("DRAW");
        }
    }
}
