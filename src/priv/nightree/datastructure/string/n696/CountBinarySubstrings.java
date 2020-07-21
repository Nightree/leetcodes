package priv.nightree.datastructure.string.n696;

class Solution {
    public int countBinarySubstrings(String s) {
        int pre = 0, cur = 1, cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cur++;
            } else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur) {
                cnt++;
            }
        }
        return cnt;
    }
}

public class CountBinarySubstrings {
    public static void main(String[] args) {
        System.out.println(new Solution().countBinarySubstrings("0010011"));
    }
}
