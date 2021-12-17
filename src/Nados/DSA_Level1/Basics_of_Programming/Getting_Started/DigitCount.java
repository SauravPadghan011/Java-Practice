package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count=0;
        while(n>0) {
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}
