//package Coursera.AlgorithmicToolbox.Week2;
import java.util.Scanner;

public class FibonacciLastDigit {

    public int[] fiboFunction(int num) {

        int[] fib = new int[num+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<=num; i++)
            fib[i] = (fib[i-1] + fib[i-2])%100;
        return fib;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num == 0)
            System.out.println(0);
        else {
            FibonacciLastDigit obj = new FibonacciLastDigit();
            int[] result = obj.fiboFunction(num);
            System.out.println(result[num]);
        }
    }
}





//package Coursera.AlgorithmicToolbox.Week2;
//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class FibonacciLastDigit {
//
//    public BigInteger[] fiboFunction(int num) {
//
//        BigInteger lastDigit10 = new BigInteger("10");
//
//        BigInteger[] fib = new BigInteger[num+1];
//        if(num == 0){
//            fib[0] = BigInteger.valueOf(0);
//            return fib;
//        }
//
//        fib[0] = BigInteger.valueOf(0);
//        fib[1] = BigInteger.valueOf(1);
//        for(int i=2; i<=num; i++) {
//            fib[i] = (fib[i-1].add(fib[i-2])).mod(lastDigit10);
//        }
//        return fib;
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        FibonacciLastDigit obj = new FibonacciLastDigit();
//        BigInteger[] result = obj.fiboFunction(num);
//        System.out.println(result[num]);
//    }
//}
