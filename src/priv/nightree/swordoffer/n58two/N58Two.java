package priv.nightree.swordoffer.n58two;

class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            stringBuilder.append(s.charAt(i % s.length()));
        }
        return stringBuilder.toString();
    }
}

public class N58Two {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseLeftWords("abcdefg", 2));
    }
}
