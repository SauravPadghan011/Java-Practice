package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class HoopJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            System.out.println(N/2+1);
        }
    }
}
