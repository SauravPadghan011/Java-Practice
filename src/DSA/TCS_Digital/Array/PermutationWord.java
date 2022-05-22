package DSA.TCS_Digital.Array;

public class PermutationWord {

    public static void permutations(String word, int l, int r) {
        if(l == r) {
//            boolean flag = false;
//            for(int i=1; i<word.length(); i++) {
//                if(word.charAt(i) == word.charAt(i-1))
//                    flag = true;
//            }
//            if(!flag)
                System.out.print(word + " ");
        } else {
            for(int i = l; i <= r; i++) {
                word = swap(word, l, i);
                permutations(word, l+1, r);
                word = swap(word, l, i);
            }
        }
    }

    public static String swap(String word, int i, int j) {
        char[] chArr = word.toCharArray();

        char temp;
        temp = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = temp;

        return String.valueOf(chArr);
    }

    public static void main(String[] args) {
        String word = "WXYZ";

        permutations(word, 0, word.length()-1);
    }
}
