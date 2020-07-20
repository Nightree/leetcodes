package priv.nightree.algorithm.math.n405;

class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] mapHex = "0123456789abcdef".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            stringBuilder.append(mapHex[num & 0b1111]);
            num >>>= 4;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}

public class Base16 {
    public static void main(String[] args) {
        System.out.println(new Solution().toHex(-1));

    }
}
