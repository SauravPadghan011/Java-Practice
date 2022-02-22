/*
* Problem to print the perfect square till that number
* Print the number which are  on at the end i.e print the perfect square number
* */
package DSA.Basics_of_Programming.Getting_Started;
import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            if(i*i > n)
                break;
            else
                System.out.println(i*i);
        }
    }
}
