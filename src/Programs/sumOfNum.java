package Programs;
import java.util.*;

public class sumOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int result = function1(num);
        System.out.println(result);
    }

    static int function1(int num) {
        if(num==0) {
            return 0;
        }
        return num + function1(num-1);
    }
}