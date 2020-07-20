package priv.nightree.basic.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 5, 2, 4, 6, 9};
        int temp;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
