package priv.nightree.basic.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {0, 4, 1, 1};
        recursion(arr, 0, arr.length);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void recursion(int[] arr, int left, int right) {
        if (left >= right - 1) {
            return;
        }
        int i = left, j = right;
        while (true) {
            while (arr[++i] < arr[left] && i < right - 1) ;
            while (arr[--j] > arr[left]) ;
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, left, j);
        recursion(arr, left, i);
        recursion(arr, i, right);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
