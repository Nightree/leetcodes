package priv.nightree.algorithm.twopointers.n345;

import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            String ret = new Solution().reverseVowels(s);

            String out = (ret);

            System.out.print(out);
        }
    }
}
