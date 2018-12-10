package sort;

public class MergeSort {
    static int[] arrayA = {23, 213, 343, 2, 132, 34, 8, 54, 56};
    static int[] arrayB = {4, 12, 234, 45};
    static int[] tmp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.println(String.valueOf(x));
        }
    }


    public static int[] mergeArray(int[] arrayA, int[] arrayB) {
        int i = 0, j = 0, k = 0;
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                tmp[k++] = arrayA[i++];
            } else {
                tmp[k++] = arrayB[j++];
            }
        }
        while (i < arrayA.length) {
            tmp[k++] = arrayA[i++];
        }
        while (j < arrayB.length) {
            tmp[k++] = arrayA[j++];
        }
        return tmp;
    }

    public static void mergeSort(int[] array, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, r);
            mergeArray(l, mid, r, array);
        }
    }

    public static void mergeArray(int l, int mid, int r, int[] arr) {
        int i = l, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= r) {
            tmp[k++] = arr[j++];
        }

        for (int ii = 0; ii < k; ii++) {
            arr[l + ii] = tmp[ii];
        }
    }


    public static void main(String[] args) {
//        printArray(mergeArray(arrayA, arrayB));
        mergeSort(arrayA, 0, arrayA.length - 1);
        printArray(arrayA);
        System.out.println("*************");
    }
}
