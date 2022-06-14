package DSA.CodeChef.Basic_1_Array;

import java.util.HashSet;
import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            HashSet<Integer> set = new HashSet<>();

            for(int i=0; i<n; i++) {
                int topic = scan.nextInt();
                set.add(topic);
            }

            if(set.size() == x)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
