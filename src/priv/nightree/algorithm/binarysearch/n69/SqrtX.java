package priv.nightree.algorithm.binarysearch.n69;

class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            int res = x / m;
            if (res == m) {
                return res;
            } else if (res < m) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h;
    }
}

public class SqrtX {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(new Solution().mySqrt(x));

    }
}
