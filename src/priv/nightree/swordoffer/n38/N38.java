package priv.nightree.swordoffer.n38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String[] permutation(String s) {
        List<String> resList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean[] flags = new boolean[s.length()];
        recursion(s, flags, stringBuilder, resList);
        Set<String> res = new HashSet<>(resList);
        return res.toArray(new String[0]);
    }

    private void recursion(String s, boolean[] flags, StringBuilder temp, List<String> resList) {
        if (temp.length() == s.length()) {
            resList.add(temp.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (flags[i]) {
                continue;
            }
            flags[i] = true;
            temp.append(s.charAt(i));
            recursion(s, flags, temp, resList);
            flags[i] = false;
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}

public class N38 {
    public static void main(String[] args) {
        String[] res = new Solution().permutation("abb");
        for (String r : res) {
            System.out.println(r);
        }
    }
}
