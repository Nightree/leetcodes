package priv.nightree.datastructure.string.n205;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sp = new int[128];
        int[] tp = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (sp[s.charAt(i)] != tp[t.charAt(i)]) {
                return false;
            }
            sp[s.charAt(i)] = i + 1;
            tp[t.charAt(i)] = i + 1;
        }
        return true;
    }
}

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("ad","aa"));
    }
}
