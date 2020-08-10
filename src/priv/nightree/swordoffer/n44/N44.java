package priv.nightree.swordoffer.n44;

class Solution {
    public int findNthDigit(int n) {
        //1 0-9 10
        //2 10-99 90*2
        //3 100-999 900*3
        //4 1000-9999 9000*4
        //0123...9101112...9899100101102...99899910001001...
        //0.......10...........190193....
        //11->0 200->0
        if (n <= 9) {
            return n;
        }
        n -= 10;
        long digit = 2, base = 90;
        while (n >= base * digit) {
            n -= base * digit;
            digit++;
            base *= 10;
        }
        long start = (int) Math.pow(10, (digit - 1));
        long num = n / digit + start;
        long index = n % digit;
        long res = 0;
        while (index >= 0) {
            res = num / start;
            num %= start;
            start /= 10;
            index--;
        }
        return (int)res;
    }
}

public class N44 {
    public static void main(String[] args) {
        System.out.println(new Solution().findNthDigit(1000000000));
    }
}
