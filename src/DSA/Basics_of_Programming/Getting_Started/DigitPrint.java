package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class DigitPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long orig = n;

        int count=0;
        while(n>0) {
            n /= 10;
            count++;
        }
        count -= 1;

        int tenMulti = (int)Math.pow(10,count);

        // tenMulti != 0 This is most important because without this it will not print number like 1000
        while(tenMulti != 0) {
            long dig = orig/tenMulti;
            orig %= tenMulti;
            tenMulti /= 10;
            System.out.println(dig);
        }
    }
}
