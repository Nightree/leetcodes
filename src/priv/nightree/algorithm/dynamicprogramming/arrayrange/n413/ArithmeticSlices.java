package priv.nightree.algorithm.dynamicprogramming.arrayrange.n413;

class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        int temp = arr[1] - arr[0];
        int cnt = 2;
        int res = 0;
        for (int i = 2; i < arr.length; i++) {
            if (temp == arr[i] - arr[i - 1]) {
                cnt++;
            } else {
                res += count(cnt);
                cnt = 2;
            }
            temp = arr[i] - arr[i - 1];
        }
        if (cnt > 2) {
            res += count(cnt);
        }
        return res;
    }

    public int count(int n) {
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = i - 2 + res;
        }
        return res;
    }
}

public class ArithmeticSlices {
    public static void main(String[] args) {
        System.out.println(new Solution().numberOfArithmeticSlices(new int[]{1, 2, 3,4,6,8}));
    }
}
