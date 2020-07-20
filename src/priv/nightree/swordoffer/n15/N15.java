package priv.nightree.swordoffer.n15;

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }
}

public class N15 {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(9));

    }
}
