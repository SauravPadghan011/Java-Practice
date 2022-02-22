package TCS_Digital.String;

public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "For Multiple Files, Custom Library and File Read/Write, use our new - Advanced Java IDE";
        System.out.println(str);

        int vow = 0, con = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            System.out.print(ch);
        }
    }
}
