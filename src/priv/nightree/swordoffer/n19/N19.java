package priv.nightree.swordoffer.n19;

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        //n.charAt为'*':
        // 前一个匹配：dp[i][j]=dp[i-1][j]||dp[i][j-2]
        // 前一个不匹配：dp[i][j]=dp[i][j-2]
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                }
                if (i == 1 && j == 1) {
                    if (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.') {
                        dp[1][1] = true;
                    }
                }
                if (j > 1) {
                    if (p.charAt(j - 1) == '*') {
                        if (i > 0 && (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.')) {
                            dp[i][j] = dp[i - 1][j] || dp[i][j - 2];
                        } else {
                            dp[i][j] = dp[i][j - 2];
                        }
                    } else {
                        if (i > 0 && (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.')) {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    }
                }
            }
        }
        return dp[m][n];
    }
}

public class N19 {
    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aa", "a"));//false
        System.out.println(new Solution().isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));//false
        System.out.println(new Solution().isMatch("a", "ab*"));//true
        System.out.println(new Solution().isMatch("aa", "a*"));//true
        System.out.println(new Solution().isMatch("ab", ".*"));//true
        System.out.println(new Solution().isMatch("abbcc", "a.*bb.*cc"));//true
        System.out.println(new Solution().isMatch("saxxxxbexxxee", "sc*a.*be.*ee"));//true
    }
}
