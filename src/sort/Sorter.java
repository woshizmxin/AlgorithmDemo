package sort;

import java.util.ArrayList;

public class Sorter {
    ArrayList<Integer> arrayList = new ArrayList<>();

    static int[] array = {23, 213, 343, 2, 132, 34, 8, 54, 56};

    private void initData() {
        arrayList.clear();
        arrayList.add(34);
        arrayList.add(12);
        arrayList.add(45);
        arrayList.add(2);
        arrayList.add(59);
        arrayList.add(46);
        arrayList.add(39);
        arrayList.add(24);
        arrayList.add(93);
    }

    private static void maopao(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        printArray(array);
    }

    private static void xuanze(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    count++;
                }
            }
        }
        System.out.println("********" + count + "*****");
    }

    private static void charu(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                count++;
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println("********" + count + "*****");
        printArray(array);
    }


    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.println(String.valueOf(x));
        }
    }

    public static void main(String[] args) {
//        printArray(array);
        maopao(array);
        System.out.println("*************");
//        charu(array);
//        insert_sort(array,array.length);
//        maopao(array);
//        printArray(array);
    }
}
