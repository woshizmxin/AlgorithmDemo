package sort;

import java.util.Hashtable;

public class ErfenSearch {
    static int count = 0;

    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int find(int[] array, int target) {
        int left = 0;
        int right = array.length;
        while (left < right) {
            count++;
            int mid = (left + right) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("******" + find(array, 9) + "*******");
        System.out.println("******" + count + "*******");
        Hashtable<String, Integer> table = new Hashtable<String, Integer>();
        table.put("zhangsan", 22);
        table.put("lisi", 33);
        table.put("wangwu", 44);
    }
}
