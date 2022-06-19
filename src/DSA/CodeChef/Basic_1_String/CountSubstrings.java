package DSA.CodeChef.Basic_1_String;

import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            int n = scan.nextInt();
            String str = scan.next();

            long no1 = 0;
            for(int i=0; i<n; i++) {
                if(str.charAt(i) == '1')
                    no1++;
//                System.out.println(no1);
            }
            System.out.println((no1*(no1+1))/2);
        }
    }
}

/*
1111
(0,0)   (0,1)   (0,2)   (0,3)
1       11      111     1111    => 4
        1       11      111     => 3
                1       11      => 2
                        1       => 1
           This will be N*(N+1)/2

10001
(0,0)   (0,1)   (0,2)   (0,3)   (0,4)
1       10      100     1000    10001   => 2
        0       00      000     0001
                0       00      001
                        0       01
                                1       => 1
         total no of 1 = 2 = 2*(3)/2

1001001
(0,0)   (0,3)   (0,6)
1       1001    1001001     => 3
        1       1001        => 2
                1           => 1
        total no of 1 = 3 = 3*(3+1)/2
 */
