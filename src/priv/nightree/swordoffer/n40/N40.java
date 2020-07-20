package priv.nightree.swordoffer.n40;

import java.util.Arrays;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        fastSelect(arr, k, 0, arr.length);
        return Arrays.copyOfRange(arr, 0, k);
    }

    private boolean fastSelect(int[] arr, int k, int start, int end) {
        if (start >= end - 1) {
            return true;
        }
        int i = start, j = end;
        while (true) {
            while (arr[++i] < arr[start] && i < end - 1) ;
            while (arr[--j] > arr[start]) ;
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, start, j);
        if (i < k) {
            return fastSelect(arr, k, i, end);
        } else if (i > k) {
            return fastSelect(arr, k, start, i);
        } else {
            return true;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class N40 {
    public static void main(String[] args) {
        int[] res = new Solution().getLeastNumbers(new int[]{0, 0, 2, 3, 2, 1, 1, 2, 0, 4}, 5);
        for (int r : res) {
            System.out.println(r);
        }
    }
}
