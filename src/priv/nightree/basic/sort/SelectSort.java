package priv.nightree.basic.sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 7, 4, 9, 1};
        int max;
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[0];
            index = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (max < arr[j]) {
                    index = j;
                    max = arr[j];
                }
            }
            arr[index] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
