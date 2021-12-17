package Nados.DSA_Level1.Basics_of_Programming.Functions_and_Arrays;
import java.util.Scanner;

public class DecToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        // write code here
        int bin=0;
        int count0=0;
        int count1=-1;
        while(n != 0) {
            int rem = n%b;
            bin = rem + bin*10;
            n = n/b;

            if(rem == 0 && count1==-1) count0++;
            else if(rem != 0 && count1==-1) {
                count1++;
            }
        }
        int result = 0;
        while(bin!=0) {
            result = bin%10 + result*10;
            bin /= 10;
        }

        return result*(int) Math.pow(10,count0);
    }
}
