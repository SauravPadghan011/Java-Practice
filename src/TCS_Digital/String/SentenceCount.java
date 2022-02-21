package TCS_Digital.String;

public class SentenceCount {
    public static void main(String[] args) {
        String str = "For Multiple Files, Custom Library and File Read/Write, use our new - Advanced Java IDE";
        System.out.println(str);

        int count = 0, vow = 0, con = 0, spChar = 0, word = 1;
        for(int i=0; i<str.length(); i++) {
            count++;
            char ch = str.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow++;
            } else if(ch == ' ') {
                word++;
            } else if(!(ch >= 'a' && ch <= 'z')) {
                spChar++;
            }else {
                con++;
            }
        }

        System.out.println("Total Character: " + count+" Word: "+ word + " Vowels: "+vow + " Consonents: "+con+" Special Character: "+spChar);
    }
}
