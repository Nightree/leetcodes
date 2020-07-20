package priv.nightree.swordoffer.n50;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, !map.containsKey(c));
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';
    }
}

public class N50 {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("abaccdeff"));
    }
}
