package priv.nightree.swordoffer.n16;

class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        boolean symbol = n > 0;
        n = Math.abs(n);
        while (n != 0) {
            if ((n & 1) == 1) {
                res *= x;
            }
            n >>>= 1;
            x *= x;
        }
        return symbol ? res : 1 / res;
    }
}

public class N16 {
    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.0, -2));
    }
}
