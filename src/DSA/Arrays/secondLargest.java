package DSA.Arrays;
import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Integer[] num = {5,5,4,6,7};
        List<Integer> intList = Arrays.asList(num);
        Collections.shuffle(intList);
        intList.toArray(num);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        int large, secondLarge, temp;
        large=num[0];
        secondLarge=num[0];
        for(int i=1; i<num.length; i++) {
            if (large<num[i]) {
                temp = large;
                large = num[i];
                secondLarge = temp;
            }
            else if(secondLarge<num[i] && secondLarge>num[i]){
                secondLarge = num[i];
            }
        }
        System.out.print("\nLarge: "+large+"\nSecond Large: "+secondLarge);
    }
}
