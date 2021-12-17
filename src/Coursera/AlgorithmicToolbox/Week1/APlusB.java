package Coursera.AlgorithmicToolbox.Week1;
import java.util.Scanner;

class APlusB {
    static int sumOfTwoDigits(int num1, int num2) {
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(sumOfTwoDigits(num1, num2));
    }
}