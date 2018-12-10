package sort;

public class QuickSort {

    static int[] array = {23, 213, 343, 2, 132, 34, 8, 54, 56};

    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.println(String.valueOf(x));
        }
    }

    public static void quickSort(int l, int r, int[] array) {
        if (l < r) {
            int key = array[l];
            int i = l;
            int j = r;
            while (i < j) {
                while (i < j && array[j] > key) {
                    j--;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }
                while (i < j && array[i] < key) {
                    i++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }
            }
            array[i] = key;
            quickSort(l, i - 1, array);
            quickSort(i + 1, r, array);
        }
    }

    public static void main(String[] args) {
        quickSort(0, array.length - 1, array);
        System.out.println("*************");
        printArray(array);
    }
}
