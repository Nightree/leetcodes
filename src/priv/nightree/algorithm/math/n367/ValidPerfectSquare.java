package priv.nightree.algorithm.math.n367;

class Solution {
    public boolean isPerfectSquare(int num) {
        int c = 1;
        int n = 0;
        while (n < num && n >= 0) {
            n += c;
            c += 2;
        }
        return n == num;
    }
}

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(new Solution().isPerfectSquare(2147483647));

    }
}
