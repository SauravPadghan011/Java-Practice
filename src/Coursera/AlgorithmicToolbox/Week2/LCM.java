//package Coursera.AlgorithmicToolbox.Week2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // For GCD
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();
        long gcd, lcm;

        long oriNum1 = num1;
        long oriNum2 = num2;

        while(num1 % num2 != 0) {
            long rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        gcd = num2;
//        System.out.println(gcd);


        // For LCM
        lcm = (oriNum1 * oriNum2)/gcd;
        System.out.println(lcm);
    }
}
