package priv.nightree.algorithm.math.n172;

class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(new Solution().trailingZeroes(5));

    }
}
