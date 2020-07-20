package priv.nightree.basic.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1, 9};
        for (int i : merge(arr, 0, arr.length - 1)) {
            System.out.println(i);
        }
    }

    public static int[] merge(int[] arr, int start, int end) {
        if (start == end) {
            return new int[]{arr[start]};
        }
        int mid = start + (end - start) / 2;
        int[] left = merge(arr, start, mid);
        int[] right = merge(arr, mid + 1, end);
        return connect(left, right);
    }

    public static int[] connect(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                res[k++] = left[i++];
            } else if (left[i] > right[j]) {
                res[k++] = right[j++];
            } else {
                res[k++] = right[j++];
                res[k++] = left[i++];
            }
        }
        if (i == left.length) {
            while (j < right.length) {
                res[k++] = right[j++];
            }
        }
        if (j == right.length) {
            while (i < left.length) {
                res[k++] = left[i++];
            }
        }
        return res;
    }
}
