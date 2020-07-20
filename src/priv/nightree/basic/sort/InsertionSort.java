package priv.nightree.basic.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 6, 1};
        int num;
        for (int i = 1; i < arr.length; i++) {
            num = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < num) {
                    arr[j + 1] = num;
                    break;
                }
                arr[j + 1] = arr[j];
                if (j == 0) {
                    arr[j] = num;
                }
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
