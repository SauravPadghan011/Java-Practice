package TCS_Digital.String;

import java.util.Scanner;

public class FootBallScore {

    public static void Solution(String[] arr) {
//        Map<>

//        for(int i=0; i<arr.length; i++) {
//
//
//            for() {
//
//            }
//        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        String[] input = new String[N*(N-1)/2];
        scan.nextLine();
        for(int i=0; i < N*(N-1)/2; i++) {
            input[i] = scan.nextLine();
        }

        Solution(input);
    }
}
