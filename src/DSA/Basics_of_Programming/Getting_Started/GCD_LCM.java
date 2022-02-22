//package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class GCD_LCM {
    public static void main(String[] args) {
        // For GCD
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd, lcm;

        int oriNum1 = num1;
        int oriNum2 = num2;

        while(num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        gcd = num2;
        System.out.println(gcd);


        // For LCM
        lcm = (oriNum1 * oriNum2)/gcd;
        System.out.println(lcm);
    }
}
