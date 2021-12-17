package Nados.DSA_Level1.Basics_of_Programming.Getting_Started;
import java.util.Scanner;

public class PythagoreanTriplet {
    public int count=0;

    public void pyFunction(int a, int b, int c) {
        if(a*a == (b*b + c*c))
            System.out.println("true");
        else if(count == 3)
            // quit the process after 3 changes
            System.out.println("false");
        else {
            // To swap the numbers
            int temp = c;
            c = a;
            a = b;
            b = temp;
            count++;
            pyFunction(a, b, c);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        PythagoreanTriplet obj = new PythagoreanTriplet();
        obj.pyFunction(a, b, c);
    }
}
