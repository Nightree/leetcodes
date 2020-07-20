package priv.nightree.algorithm.math.n415;

class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            carry += i >= 0 ? num1.charAt(i--) - '0' : 0;
            carry += j >= 0 ? num2.charAt(j--) - '0' : 0;
            stringBuilder.append(carry % 10);
            carry /= 10;
        }
        return stringBuilder.reverse().toString();
    }
}

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("23", "5"));

    }
}
