package DSA.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class PatternType12 {

    public int[] fiboFunction(int n){
        int size = 0, orig = n;
        while(n >= 0) {
            size += n;
            n--;
        }
        System.out.println(size);

        int[] fib = new int[size];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<size; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        PatternType12 obj = new PatternType12();
        int[] result = obj.fiboFunction(n);
        int count=0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(result[count++]+ "\t");
            }
            System.out.println();
        }
    }
}
