package DSA.Searching;
import java.util.Scanner;

public class BinarySearch {

    public int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
    public static Scanner scan = new Scanner(System.in);

    public void print() {
        for(int i=0; i<10; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int binarySearchMethod(int[] array, int low, int high, int searchKey) {
        // if item is greater than the max element return -1
        if(searchKey > array[high]) return -1;

        // if element found at first position
        if (array[low] == searchKey) return low;
        else {
            int mid = (low + high) / 2;
            if (array[mid] == searchKey) {                                          // if element is found at mid
                return mid;
            } else if (searchKey < array[mid] ) {
                return binarySearchMethod(array, low, mid - 1, searchKey);     // if item < mid-element search in the first half
            } else {
                return binarySearchMethod(array, mid +1, high, searchKey);      // if item < mid-element search in the second half
            }
        }
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.print();

        System.out.print("\nEnter number to be search: ");
        int searchKey = scan.nextInt();
        int result = obj.binarySearchMethod(obj.array, 0, 9, searchKey);
        if (result == -1) System.out.println("Element not present");
        else System.out.println("Element found at index " + result);
    }
}
