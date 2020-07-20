package priv.nightree.swordoffer.n14one;

class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }
}

public class N14One {
    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(10));

    }
}
