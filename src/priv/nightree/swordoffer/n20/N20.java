package priv.nightree.swordoffer.n20;

class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0)
            return false;
        return s.matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}

public class N20 {
    public static void main(String[] args) {
        System.out.println(new Solution().isNumber("e5"));

    }
}
