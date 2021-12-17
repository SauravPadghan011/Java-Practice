package DSA.Arrays;
import java.util.Arrays;

public class LargestSecondL {
    public static void main(String[] args) {
        int[] arr = new int[]{1,20,14,12,4,25};

        // Print array
        System.out.println(Arrays.toString(arr));

        // Find Largest element
        System.out.println(arr[largest(arr)]);

        // Find second largest by naive method (find the largest first then second largest)
        System.out.println(arr[secondLargestNaive(arr)]);

        // Find second largest by using efficient method
        System.out.println(arr[secondLargestEfficient(arr)]);
    }

    static int largest(int[] arr) {
        int largeIdx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr[largeIdx])
                largeIdx = i;
        }

        return largeIdx;
    }

    static int secondLargestEfficient(int[] arr) {
        int result = -1;
        int smallest = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[smallest]) {
                result = smallest;
                smallest = i;
            } else if(arr[i] != arr[smallest]) {
                if(result == -1 || arr[i] < arr[result]) {
                    result = i;
                }
            }
        }

        return result;
    }

    static int secondLargestNaive(int[] arr) {
        int secondIdx = -1;
        int largeIdx = largest(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != arr[largeIdx]) {
                if(secondIdx == -1)
                    secondIdx = i;
                else if(arr[i] > arr[secondIdx]) {
                    secondIdx = i;
                }
            }
        }
        return secondIdx;
    }
}