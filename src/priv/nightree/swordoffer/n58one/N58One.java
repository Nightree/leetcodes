package priv.nightree.swordoffer.n58one;

class Solution {
    public String reverseWords(String s) {
        String trim = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int j = trim.length() - 1;
        int i = j;
        while (i >= 0) {
            while (i >= 0 && trim.charAt(i) != ' ') {
                i--;
            }
            stringBuilder.append(trim.substring(i + 1, j + 1)).append(" ");
            while (i >= 0 && trim.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return stringBuilder.toString().trim();
    }
}

public class N58One {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("  hello world!  "));
    }
}
