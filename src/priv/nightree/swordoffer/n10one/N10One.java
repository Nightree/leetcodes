package priv.nightree.swordoffer.n10one;

class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int res = 0;
        int t1 = 1;
        int t2 = 0;
        for (int i = 2; i <= n; i++) {
            res = t1%1000000007 + t2%1000000007;
            t2 = t1%1000000007;
            t1 = res%1000000007;
        }
        return res%1000000007;
    }
}

public class N10One {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(5));
    }
}
