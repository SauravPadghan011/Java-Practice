package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class InverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int last_digit;
        int result = 0;
        while(n>0) {
            last_digit = n%10;
            n /= 10;
            count++;

            int multi = 1;
            int temp = last_digit-1;
            while(temp>0) {
                multi *= 10;
                temp--;
            }
            result = result + count*(multi);
        }
        System.out.println(result);
    }
}
