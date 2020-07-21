package priv.nightree.algorithm.twopointers.n345;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    private HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        char[] result = new char[s.length()];
        int i=0;
        int j = result.length - 1;
        char t;
        while (i <= j) {
            if (vowels.contains(s.charAt(i))) {
                if (vowels.contains(s.charAt(j))) {
                    t = s.charAt(i);
                    result[i++] = s.charAt(j);
                    result[j--] = t;
                } else {
                    result[j] = s.charAt(j);
                    j--;
                }
            } else {
                result[i] = s.charAt(i);
                i++;
            }
        }
        return new String(result);
    }
}

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels("cbahie"));
    }
}
