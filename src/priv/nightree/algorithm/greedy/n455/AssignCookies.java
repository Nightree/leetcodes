package priv.nightree.algorithm.greedy.n455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = new int[]{1, 2, 3};
        int[] s = new int[]{1, 1};
        System.out.println(new Solution().findContentChildren(g, s));
    }
}
