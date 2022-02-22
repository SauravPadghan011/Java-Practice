package DSA.Basics_of_Programming.Getting_Started;
import java.util.Scanner;

public class PrimeFactor {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scan.nextInt();

        for(int div=2; div*div <= num; div++) {
            while(num%div == 0) {
                num /= div;
                System.out.print(div+" ");
            }
        }

        if(num != 1)
            System.out.print(num);
    }
}
