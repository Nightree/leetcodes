package priv.nightree.datastructure.string.n647;

class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    int m = i, n = j;
                    while (true) {
                        if (m >= n) {
                            res++;
                            break;
                        }
                        if (chars[m] != chars[n]) {
                            break;
                        }
                        m++;
                        n--;
                    }
                }
            }
        }
        return res;
    }
}

public class PalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(new Solution().countSubstrings("abc"));
    }
}
