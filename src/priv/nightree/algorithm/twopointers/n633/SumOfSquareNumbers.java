package priv.nightree.algorithm.twopointers.n633;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            int res = i * i + j * j;
            if (res == c) {
                return true;
            } else if (res < c) {
                i++;
            } else if (res > c) {
                j--;
            }

        }
        return false;
    }
}

public class SumOfSquareNumbers {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int c = Integer.parseInt(line);

            boolean ret = new Solution().judgeSquareSum(c);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
