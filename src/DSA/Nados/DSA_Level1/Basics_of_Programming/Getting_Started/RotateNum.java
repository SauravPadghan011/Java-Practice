package DSA.Nados.DSA_Level1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;

public class RotateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;        // num of digit
        while(temp>0) {
            temp /= 10;
            nod++;
        }

        k %= nod;           // for special case. like rotate by 351 i. e rotate by 1
        if(k<0) {
            k += nod;
        }

        int div = 1;
        int multi = 1;
        for(int i=1; i <= nod; i++) {
            if(i<=k) {
                div *= 10;
            } else {
                multi *= 10;
            }
        }
        int rotated = n/div;
        int shifted = n%div;
        int result = shifted*multi + rotated;
        System.out.println(result);
    }
}
