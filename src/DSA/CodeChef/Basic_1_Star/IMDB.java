package DSA.CodeChef.Basic_1_Star;

import java.util.Scanner;

public class IMDB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            int N = scan.nextInt();
            int X = scan.nextInt();
            int movie = 0;

            while(N-- != 0) {
                int Si = scan.nextInt();
                int Ri = scan.nextInt();

                if(Si <= X) {
                    movie = Math.max(movie, Ri);
                }
            }
            System.out.println(movie);
        }
    }
}
