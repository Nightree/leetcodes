package priv.nightree.algorithm.math.n67;

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0 && a.charAt(i--) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j--) == '1') {
                carry++;
            }
            stringBuilder.append(carry % 2);
            carry /= 2;
        }
        return stringBuilder.reverse().toString();
    }
}

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("1011", "100"));
    }
}
