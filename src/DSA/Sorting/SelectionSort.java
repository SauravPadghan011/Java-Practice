package DSA.Sorting;

public class SelectionSort {
    public int[] array = new int[]{64, 25, 12, 22, 11, 1};
//    public int[] array = new int[]{9,14,3,2,43,11,58,22};

    public void selectionSort() {
        for(int j=0; j< array.length; j++) {
            int min = j;
            for (int i=j+1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
    }


    public static void main(String[] args) {

        SelectionSort obj = new SelectionSort();
        System.out.print("Original Array: ");
        for(int i: obj.array) {
            System.out.print(i + " ");
        }
        obj.selectionSort();

        System.out.print("\nAfter Sorting: ");
        for(int i: obj.array) {
            System.out.print(i + " ");
        }
    }
}
