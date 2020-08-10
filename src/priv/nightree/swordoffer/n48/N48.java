package priv.nightree.swordoffer.n48;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int i = -1;
        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)));
            }
            map.put(s.charAt(j), j);
            res = Math.max(res, j - i);
        }
        return res;
    }
}

public class N48 {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abba"));
    }
}
