package priv.nightree.swordoffer.n49;

class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int m2 = 2, m3 = 3, m5 = 5;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.min(Math.min(m2, m3), m5);
            if (dp[i] == m2) {
                i2++;
                m2 = dp[i2] * 2;
            }
            if (dp[i] == m3) {
                i3++;
                m3 = dp[i3] * 3;
            }
            if (dp[i] == m5) {
                i5++;
                m5 = dp[i5] * 5;
            }
        }
        return dp[n - 1];
    }
}

public class N49 {
    public static void main(String[] args) {
        System.out.println(new Solution().nthUglyNumber(10));

    }
}
