package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class MaxLengthEvenSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int sum = (N*(N+1))/2;
            if(sum%2 == 1)
                System.out.println(N-1);
            else
                System.out.println(N);
        }
    }
}
