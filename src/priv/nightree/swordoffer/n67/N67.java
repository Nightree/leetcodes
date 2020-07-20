package priv.nightree.swordoffer.n67;

class Solution {
    public int strToInt(String str) {
        boolean symbol = true;
        long res = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            if (str.charAt(i) == '-' || str.charAt(i) == '+' || str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
                if (str.charAt(i) == '-') {
                    i++;
                    symbol = false;
                } else if (str.charAt(i) == '+') {
                    i++;
                }
                while (i < str.length() && str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
                    stringBuilder.append(str.charAt(i));
                    i++;
                }
                break;
            }
            break;
        }
        stringBuilder.reverse();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (symbol) {
                res += (stringBuilder.charAt(i) - '0') * Math.pow(10, i);
            } else {
                res -= (stringBuilder.charAt(i) - '0') * Math.pow(10, i);
            }
            if (res > 2147483647) {
                return 2147483647;
            }
            if (res < -2147483648) {
                return -2147483648;
            }
        }
        return (int) res;
    }
}

public class N67 {
    public static void main(String[] args) {
        System.out.println(new Solution().strToInt("  -123asb 3445"));
        System.out.println(new Solution().strToInt("445"));
        System.out.println(new Solution().strToInt("asb 3445"));
    }
}
