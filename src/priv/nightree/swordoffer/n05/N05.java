package priv.nightree.swordoffer.n05;

class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}

public class N05 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(new Solution().replaceSpace(s));
    }
}
