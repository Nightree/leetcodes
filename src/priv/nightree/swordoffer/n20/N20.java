package priv.nightree.swordoffer.n20;

class Solution {

    private String str;

    public boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        str = s.trim();
        boolean res = isInteger();
        if (!str.isEmpty() && str.charAt(0) == '.') {
            str = str.substring(1);
            res = isUnsignedInteger() || res;
        }
        if (!str.isEmpty() && str.charAt(0) == 'e') {
            str = str.substring(1);
            res = res && isInteger();
        }
        return res && str.isEmpty();
    }

    private boolean isInteger() {
        if (str.length() == 0) {
            return false;
        }
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            str = str.substring(1);
        }
        return isUnsignedInteger();
    }

    private boolean isUnsignedInteger() {
        if (str.length() == 0) {
            return false;
        }
        String temp = str;
        while (!str.isEmpty() && str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            str = str.substring(1);
        }
        return !temp.equals(str);
    }
}

public class N20 {
    public static void main(String[] args) {
        System.out.println(new Solution().isNumber("+100"));
        System.out.println(new Solution().isNumber("5e2"));
        System.out.println(new Solution().isNumber(".123"));
        System.out.println(new Solution().isNumber("3.1416"));
        System.out.println("-----------------------");
        System.out.println(new Solution().isNumber("12e"));
        System.out.println(new Solution().isNumber("1a3.14"));
        System.out.println(new Solution().isNumber("1.2.3"));
        System.out.println(new Solution().isNumber("+-5"));
        System.out.println(new Solution().isNumber("-1E-16"));
        System.out.println(new Solution().isNumber("12e+5.4"));

    }
}
