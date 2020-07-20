package priv.nightree.datastructure.string.n242;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(new Solution().isAnagram(s, t));
    }
}
