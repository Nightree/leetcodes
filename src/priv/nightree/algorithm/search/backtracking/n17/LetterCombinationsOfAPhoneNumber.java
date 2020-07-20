package priv.nightree.algorithm.search.backtracking.n17;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private String[] phoneNumberMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        StringBuilder stringBuilder = new StringBuilder();
        findAll(stringBuilder, res, digits);
        return res;
    }

    private void findAll(StringBuilder stringBuilder, List<String> res, String digits) {
        if (stringBuilder.length() == digits.length()) {
            res.add(stringBuilder.toString());
            return;
        }
        String str = phoneNumberMap[digits.charAt(stringBuilder.length()) - '0' - 2];
        for (char c : str.toCharArray()) {
            stringBuilder.append(c);
            findAll(stringBuilder, res, digits);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(new Solution().letterCombinations(digits));
    }
}
