package priv.nightree.algorithm.twopointers.n680;

import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                } else if (diff == 2) {
                    res = false;
                }
            }
        }
        return res;
    }
}

public class ValidPalindrome {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            boolean ret = new Solution().validPalindrome(s);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
