package sort;

public class ShellSort {
    static int[] array = {23, 213, 343, 2, 132, 34, 8, 54, 56};

    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.println(String.valueOf(x));
        }
    }

    public static void shellSort(int[] array) {
        int len = array.length;
        int incre = len;
        while (true) {
            incre = incre / 2;
            for (int k = 0; k < incre; k++) {
                for (int i = k; i < len; i = i + incre) {
                    for (int j = i; j > k; j = j - incre) {
                        if (array[j] > array[j - incre]) {
                            int tmp = array[j];
                            array[j] = array[j - incre];
                            array[j - incre] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }

            if (incre == 1) {
                break;
            }

        }

    }


    public static void main(String[] args) {
        shellSort(array);
        printArray(array);
        System.out.println("*************");
    }
}
