package DSA.CodeChef.Basic_1_String;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- != 0) {
            String str = scan.next();

            int otherHalf = str.length()/2;
            if(str.length()%2 != 0)
                otherHalf += 1;

            String leftSubStr = str.substring(0,str.length()/2);
            String rightSubStr = str.substring(otherHalf);
            HashMap<Character, Integer> leftHalfHash = new HashMap<>();
            HashMap<Character, Integer> rightHalfHash = new HashMap<>();

            for(int i=0; i<leftSubStr.length(); i++) {
                char ch = leftSubStr.charAt(i);
                leftHalfHash.put(ch, leftHalfHash.containsKey(ch) ? leftHalfHash.get(ch) + 1 : 1);
            }

            for(int i=0; i<rightSubStr.length(); i++) {
                char ch = rightSubStr.charAt(i);
                rightHalfHash.put(ch, rightHalfHash.containsKey(ch) ? rightHalfHash.get(ch) + 1 : 1);
            }

            boolean ans = true;
            for(int i=0; i<leftSubStr.length(); i++) {
                char ch = leftSubStr.charAt(i);
                if(!Objects.equals(leftHalfHash.get(ch), rightHalfHash.get(ch)))
                    ans = false;
            }

            if(ans) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
