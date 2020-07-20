package priv.nightree.algorithm.twopointers.n524;

import java.util.Arrays;
import java.util.List;

class Solution {
    public String findLongestWord(String s, List<String> d) {
        String res = "";
        for (String target : d) {
            if (res.length() > target.length()
                    || (res.length() == target.length() && res.compareTo(target) < 0)) {
                continue;
            }
            if (isSubStr(s, target)) {
                res = target;
            }
        }
        return res;
    }

    public boolean isSubStr(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j==target.length();
    }
}

public class LongestWordInDictionaryThroughDeleting {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> d = Arrays.asList("d", "b", "a", "c");
        String result = new Solution().findLongestWord(s, d);
        System.out.println(result);
    }
}
