package DSA.Sorting;

public class InsertionSort {
    public int[] array = new int[]{7, 2, 1, 5, 3, 9, 10, 4, 6, 8};

    public void insertionSortMethod(int[] array) {

    }


    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        System.out.print("Before Sorting: ");
        for(int i: obj.array) System.out.print(i+" ");
        System.out.println();

        obj.insertionSortMethod(obj.array);

        System.out.print("Before Sorting: ");
        for(int i: obj.array) System.out.print(i+" ");
        System.out.println();
    }
}
