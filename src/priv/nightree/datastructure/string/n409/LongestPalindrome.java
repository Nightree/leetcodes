package priv.nightree.datastructure.string.n409;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                flag = true;
            }
            res += value / 2;
        }
        return flag ? res * 2 + 1 : res * 2;
    }
}

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("abccccdd"));

    }
}
