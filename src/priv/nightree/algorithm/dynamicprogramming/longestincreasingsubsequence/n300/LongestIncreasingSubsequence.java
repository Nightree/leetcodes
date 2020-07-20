package priv.nightree.algorithm.dynamicprogramming.longestincreasingsubsequence.n300;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
        }

        int res = 0;
        for (int i : dp) {
            res = Math.max(res, i);
        }
        return res;
    }
}

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
