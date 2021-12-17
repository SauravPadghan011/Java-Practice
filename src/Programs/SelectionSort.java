package Programs;

public class SelectionSort {
//    public int[] array = new int[]{9,14,3,2,43,11,58,22};
//    public int[] array = new int[]{7, 2, 1, 5, 3, 9, 10, 4, 6, 8};
    public int[] array = new int[]{64, 25, 12, 22, 11, 1};

    public void selectionSortMethod() {
        for(int i=0; i<array.length; i++) {
            int min = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();

        System.out.println("Before Sorting");
        for(int i: obj.array)
            System.out.print(i+" ");
        System.out.println();

        obj.selectionSortMethod();

        System.out.println("\nAfter Sorting");
        for(int i: obj.array)
            System.out.print(i+" ");
    }
}
