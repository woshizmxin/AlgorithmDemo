package sort;

public class BigSmall {

    static char arr[] = {'a', 'b', 'c'};

    static void print(int i) {
        if (i >= 0) {
            System.out.print(arr[i]);
            print(i - 1);
        }
        return;
    }

    public static void main(String[] args) {
        int length = arr.length - 1;
        print(length - 1);
    }

    /**转大写**/
    private static char charToUpperCase(char ch){
        if(ch <= 122 && ch >= 97){
            ch -= 32;
        }
        return ch;
    }

}
