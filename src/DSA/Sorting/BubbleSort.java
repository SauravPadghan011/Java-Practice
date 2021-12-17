package DSA.Sorting;

public class BubbleSort {
    public int[] array = new int[]{7, 2, 1, 5, 3, 9, 10, 4, 6, 8};
//public int[] array = new int[]{9,14,3,2,43,11,58,22};
//public int[] array = new int[]{64, 25, 12, 22, 11, 1};
//public int[] array = new int[]{1, 11, 12, 22, 25, 64};

    public void bubbleSortMethod() {
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void bubbleSortRecursiveMethod(int[] array, int length) {
        if(length == 1) return;

        for(int i=0; i<length-1; i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
            bubbleSortRecursiveMethod(array, length-1);
        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();

        System.out.print("Original Array: ");
        for(int i: obj.array) {
            System.out.print(i + " ");
        }

//        obj.bubbleSortMethod();
        obj.bubbleSortRecursiveMethod(obj.array, obj.array.length);

        System.out.print("\nAfter Sorting: ");
        for(int i: obj.array) {
            System.out.print(i + " ");
        }
    }
}
