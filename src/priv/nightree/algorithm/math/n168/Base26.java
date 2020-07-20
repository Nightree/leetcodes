package priv.nightree.algorithm.math.n168;

class Solution {
    public String convertToTitle(int n) {
        if (n == 0) {
            return "";
        }
        n--;
        return convertToTitle(n / 26) + (char) (n % 26 + 'A');
    }
}

public class Base26 {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(25));

    }
}
