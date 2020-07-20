package priv.nightree.swordoffer.n65;

class Solution {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}

public class N65 {
    public static void main(String[] args) {
        System.out.println(new Solution().add(2, 5));
    }
}
