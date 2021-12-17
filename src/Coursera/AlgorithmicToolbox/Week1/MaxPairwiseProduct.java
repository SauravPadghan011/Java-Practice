package Coursera.AlgorithmicToolbox.Week1;
import java.util.*;

public class MaxPairwiseProduct {
    static Scanner scan = new Scanner(System.in);
    static MaxPairwiseProduct obj = new MaxPairwiseProduct();
    private int large=-1, secondLarge=-1;

    public int largeMethod(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            if((large == -1) || numbers[i]>numbers[large])
                large = i;
        }
        return large;
    }

    public int secondLargeMethod(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            if(i != large && (secondLarge ==-1 || numbers[i]>numbers[secondLarge]))
                secondLarge = i;
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int large, secondLarge;

        int n = scan.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<n; i++) {
            numbers[i] = scan.nextInt();
        }

        large = obj.largeMethod(numbers);
        secondLarge = obj.secondLargeMethod(numbers);
        System.out.println((long)numbers[large]*numbers[secondLarge]);
    }


}
