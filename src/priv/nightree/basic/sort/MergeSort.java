package priv.nightree.basic.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1, 9};
        for (int i : merge(arr, 0, arr.length)) {
            System.out.println(i);
        }
    }

    public static int[] merge(int[] arr, int start, int end) {
        if (start == end - 1) {
            return new int[]{arr[start]};
        }
        int mid = start + (end - start) / 2;
        int[] left = merge(arr, start, mid);
        int[] right = merge(arr, mid, end);
        return connect(left, right);
    }

    public static int[] connect(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                res[k++] = left[i++];
            } else if (left[i] > right[j]) {
                res[k++] = right[j++];
            }
        }
        while (j < right.length) {
            res[k++] = right[j++];
        }
        while (i < left.length) {
            res[k++] = left[i++];
        }
        return res;
    }
}
