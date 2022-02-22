package DSA.Basics_of_Programming.Functions_and_Arrays;
import java.util.Scanner;


public class AnyBaseToDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        // write your code here
        int dec = 0;
        int count = 0;

        while(n!=0) {
            int lastDigit = n%10;
            dec = dec + lastDigit*(int)Math.pow(b,count);
            count++;
            n/=10;
        }

        return dec;
    }
}
