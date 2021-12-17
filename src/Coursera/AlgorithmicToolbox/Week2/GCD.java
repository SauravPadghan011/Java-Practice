//package Coursera.AlgorithmicToolbox.Week2;
import java.util.Scanner;

public class GCD {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int gcd;

        while(num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        gcd = num2;
        System.out.println(gcd);
    }
}
