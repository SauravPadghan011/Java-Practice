//package Coursera.AlgorithmicToolbox.Week2;
import java.util.Scanner;

public class FibonacciWithMod {

    public int[] fiboFunction(int num, int mod) {

        int[] fib = new int[num+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<=num; i++)
            fib[i] = (fib[i-1] + fib[i-2])%mod;
        return fib;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int mod = scan.nextInt();

        if(num == 0)
            System.out.println(0);
        else {
            FibonacciWithMod obj = new FibonacciWithMod();
            int[] result = obj.fiboFunction(num, mod);
            System.out.println(result[num]);
        }
    }
}
