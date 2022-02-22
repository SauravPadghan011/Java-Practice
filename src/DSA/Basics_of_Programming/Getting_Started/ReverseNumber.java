package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0) {
            int dig = n%10;
            System.out.println(dig);
            n /= 10;
        }
    }
}
