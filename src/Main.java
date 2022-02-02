

public class Main
{
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4,6,2,5,7,9,1,3};

        QuickSort(arr, 0, arr.length-1);

        for(int i: arr) {
            System.out.print(i+" ");
        }

    }

    public static void QuickSort(Integer[] arr, int l, int h) {
        if(l<h) {
            int pivot = Partition(arr, l, h);
            QuickSort(arr, l, pivot-1);
            QuickSort(arr, pivot+1, h);
        }
    }

    public static int Partition(Integer[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;

        while(i<j) {
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;
        return j;
    }
}
