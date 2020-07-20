package priv.nightree.algorithm.math.n504;

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            stringBuilder.append(num % 7);
            num /= 7;
        }
        stringBuilder.reverse();
        return isNegative ? "-" + stringBuilder.toString() : stringBuilder.toString();
    }
}

public class Base7 {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToBase7(-8));

    }
}
