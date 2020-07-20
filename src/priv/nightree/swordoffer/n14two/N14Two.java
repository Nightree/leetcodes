package priv.nightree.swordoffer.n14two;

class Solution {
    public int cuttingRope(int n) {
        if (n < 4) {
            return n - 1;
        }
        int a = n / 3;
        if (n % 3 == 1) {
            a--;
        }
        return (int)((long)fastPower(3, a) * (n - 3 * a == 0 ? 1 : n - 3 * a) % (int) (1e9 + 7));
    }

    public int fastPower(long x, long a) {
        long res = 1;
        while (a != 0) {
            if ((a & 1) == 1) {
                res = (res % (int) (1e9 + 7) * (x % (int) (1e9 + 7))) % (int) (1e9 + 7);
            }
            x = (x % (int) (1e9 + 7) * (x % (int) (1e9 + 7))) % (int) (1e9 + 7);
            a >>= 1;
        }
        return (int) (res % (int) (1e9 + 7));
    }
}

public class N14Two {
    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(127));

    }
}
