package priv.nightree.algorithm.dynamicprogramming.longestincreasingsubsequence.n646;

import java.util.Arrays;

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return Arrays.stream(dp).max().orElse(0);
    }
}

public class MaximumLengthOfPairChain {
    public static void main(String[] args) {
        System.out.println(new Solution().findLongestChain(new int[][]{
                {1, 2}, {5, 6}, {3, 4}, {4, 5}
        }));
    }
}
