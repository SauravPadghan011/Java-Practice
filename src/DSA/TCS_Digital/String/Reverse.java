package TCS_Digital.String;

public class Reverse {
    public static void main(String[] args) {
        String str = "Some string to reverse";
        System.out.println(str);

        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }

        System.out.println(reverse);
    }
}
