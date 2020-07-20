package priv.nightree.algorithm.binarysearch.n744;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, h = letters.length - 1;
        int m;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (letters[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l<letters.length?letters[l]:letters[0];
    }
}

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        System.out.println(new Solution().nextGreatestLetter(letters, 'a'));
    }
}
