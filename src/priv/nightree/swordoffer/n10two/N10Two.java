package priv.nightree.swordoffer.n10two;

class Solution {
    public int numWays(int n) {
        int t2 = 1;
        int t1 = 2;
        int res = t1;
        for (int i = 3; i <= n; i++) {
            res = (t1 + t2) % 1000000007;
            t2 = t1;
            t1 = res;
        }
        return n > 1 ? res : t2;
    }
}

public class N10Two {
    public static void main(String[] args) {
        System.out.println(new Solution().numWays(7));
    }
}
