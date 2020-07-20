package priv.nightree.algorithm.dynamicprogramming.splitinteger.n343;

class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }
}

public class IntegerBreak {
    public static void main(String[] args) {
        System.out.println(new Solution().integerBreak(10));

    }
}
