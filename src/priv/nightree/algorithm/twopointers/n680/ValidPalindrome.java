package priv.nightree.algorithm.twopointers.n680;

class Solution {
    public boolean validPalindrome(String s) {
        int bi=0,bj=s.length()-1;
        int diff=0;
        boolean res = true;
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                if (diff == 0) {
                    bi = i;
                    bj = j;
                    j++;
                    diff = 1;
                } else if (diff == 1) {
                    i=bi-1;
                    j=bj;
                    diff = 2;
                } else {
                    res = false;
                }
            }
        }
        return res;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new Solution().validPalindrome("abcb"));
    }
}
