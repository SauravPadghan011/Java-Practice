package DSA.CodeChef.Basic_1_Array;

import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            int N = scan.nextInt();

            int[] cars = new int[N];
            for(int i=0; i<N; i++)
                cars[i] = scan.nextInt();

            int carReached = 1, i=1, gas = cars[0], dist = 0;
            while(gas > 0 && carReached <= N && i<N) {
                gas = gas - 1 + cars[i];
                i++;
                dist++;
                carReached++;
            }

            System.out.println(dist + gas);
        }
    }
}
