package priv.nightree.algorithm.search.backtracking.n93;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() == 0) {
            return res;
        }
        StringBuilder stringBuilder = new StringBuilder();
        backTracking(0, stringBuilder, res, s);
        return res;
    }

    private void backTracking(int n, StringBuilder stringBuilder, List<String> res, String s) {
        if (n == 4 || s.length() == 0) {
            if (n == 4 && s.length() == 0) {
                res.add(stringBuilder.toString());
            }
            return;
        }

        for (int i = 0; i < s.length() && i <= 2; i++) {
            if (i != 0 && s.charAt(0) == '0') {
                break;
            }
            String part = s.substring(0, i + 1);
            if (Integer.parseInt(part) <= 255) {
                if (stringBuilder.length() != 0) {
                    part = "." + part;
                }
                stringBuilder.append(part);
                backTracking(n + 1, stringBuilder, res, s.substring(i + 1));
                stringBuilder.delete(stringBuilder.length() - part.length(), stringBuilder.length());
            }
        }
    }
}

public class RestoreIPAddresses {
    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(new Solution().restoreIpAddresses(s));
    }
}
