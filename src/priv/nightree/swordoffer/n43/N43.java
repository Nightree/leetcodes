package priv.nightree.swordoffer.n43;

class Solution {
    public int countDigitOne(int n) {
        int res = 0, high = n / 10, low = 0, cur = n % 10, digit = 1;
        while (!(high == 0 && cur == 0)) {
            if (cur == 0) {
                res += high * digit;
            } else if (cur == 1) {
                res += high * digit + low + 1;
            } else {
                res += (high + 1) * digit;
            }
            digit *= 10;
            low = n % digit;
            cur = high % 10;
            high /= 10;
        }
        return res;
    }
}

public class N43 {
    public static void main(String[] args) {
        System.out.println(new Solution().countDigitOne(12));

    }
}
