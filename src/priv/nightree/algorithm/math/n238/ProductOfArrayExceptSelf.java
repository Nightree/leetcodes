package priv.nightree.algorithm.math.n238;

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        int left = 1;
        for (int i = 1; i < n; i++) {
            left *= nums[i - 1];
            res[i] *= left;
        }
        int right = 1;
        for (int i = n - 2; i >= 0; i--) {
            right *= nums[i + 1];
            res[i] *= right;
        }
        return res;
    }
}

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] res = new Solution().productExceptSelf(new int[]{1, 2, 3, 4});
        for (int r : res) {
            System.out.println(r);
        }
    }
}
