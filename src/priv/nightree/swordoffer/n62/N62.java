package priv.nightree.swordoffer.n62;

class Solution {
    public int lastRemaining(int n, int m) {
        if (n == 1) {
            return 0;
        }
        return (lastRemaining(n - 1, m) + m) % n;
    }
}

public class N62 {
    public static void main(String[] args) {
        System.out.println(new Solution().lastRemaining(10, 17));
    }
}
