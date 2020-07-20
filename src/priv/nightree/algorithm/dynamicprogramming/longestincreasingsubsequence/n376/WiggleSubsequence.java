package priv.nightree.algorithm.dynamicprogramming.longestincreasingsubsequence.n376;

class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        int[] diff = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                diff[i] = -1;
            } else if (nums[i] > nums[i + 1]) {
                diff[i] = 1;
            }
        }
        int t = 0;
        for (int value : diff) {
            if (value != 0 && value != t) {
                res++;
                t = value;
            }
        }
        return res + 1;
    }
}

public class WiggleSubsequence {
    public static void main(String[] args) {
        System.out.println(new Solution().wiggleMaxLength(new int[]{1,7,4,9,2,5}));
    }
}
