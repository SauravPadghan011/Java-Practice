package Programs;
import java.util.Scanner;

public class BinarySearch {
    public int[] array = new int[]{7, 2, 1, 5, 3, 9, 10, 4, 6, 8};
//    7, 5, 2, 1, 5, 3, 9, 10, 4, 6, 8          1, 2, 3, 4, 5, 6, 7, 8, 9 ,10
    public Scanner scan = new Scanner(System.in);

    public int binarySearchFunction(int low, int high, int item) {
        if(item > array[high]) return -1;
        if(array[low] == item) {
            return low;
        } if(array[high] == item) {
            return high;
        } else {
            int mid = (low+high)/2;
            if(array[mid] == item) return mid;
            if(item < array[mid]) return binarySearchFunction(low, mid-1, item);
            else return binarySearchFunction(mid+1, high, item);
        }
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        for(int i: obj.array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int item = obj.scan.nextInt();
        int location = obj.binarySearchFunction(0, 9, item);
        if(location == -1) System.out.print("Number not found");
        else System.out.println("Number found at: " + location);
    }
}
