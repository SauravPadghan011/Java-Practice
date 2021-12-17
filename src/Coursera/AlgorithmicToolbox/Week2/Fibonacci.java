package Coursera.AlgorithmicToolbox.Week2;
import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

    public BigInteger[] fiboFunction(int num) {

        BigInteger[] fib = new BigInteger[num+1];
        if(num == 0){
            fib[0] = BigInteger.valueOf(0);
            return fib;
        }

        fib[0] = BigInteger.valueOf(0);
        fib[1] = BigInteger.valueOf(1);
        for(int i=2; i<=num; i++) {
            fib[i] = fib[i-1].add(fib[i-2]);
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Fibonacci obj = new Fibonacci();
        BigInteger[] result = obj.fiboFunction(num);
        System.out.println(result[num]);
    }
}
