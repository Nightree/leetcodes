package priv.nightree.algorithm.greedy.n392;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char ch : s.toCharArray()) {
            index = t.indexOf(ch, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}

public class IsSubsequence {
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "abc";
        System.out.println(new Solution().isSubsequence(s, t));
    }
}
