package DSA.Basics_of_Programming.Getting_Started;
import java.util.Scanner;

public class InverseNumLR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int orig = n;

        int totalDigit=0;
        // Count no of digit
        while(n != 0) {
            n /= 10;
            totalDigit++;
        }

        // Logic for rearranging numbers
        int digit = totalDigit;
        int result=0;
        while(orig != 0) {
            int lastDigit = orig%10;
            result = result + digit*((int)Math.pow(10, (totalDigit-lastDigit)));
            orig /= 10;
            digit--;
        }
        System.out.println(result);
    }
}
