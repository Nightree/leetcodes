package priv.nightree.algorithm.dynamicprogramming.splitinteger.n279;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numSquares(int n) {
        List<Integer> squares = generateSquare(n);
        int[] dp = new int[n + 1];
        int min;
        for (int i = 1; i <= n; i++) {
            min = Integer.MAX_VALUE;
            for (Integer square : squares) {
                if (i >= square) {
                    min = Math.min(min, dp[i - square] + 1);
                }
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public List<Integer> generateSquare(int n) {
        List<Integer> squares = new ArrayList<>();
        int square = 1, c = 3;
        while (square <= n) {
            squares.add(square);
            square += c;
            c += 2;
        }
        return squares;
    }
}

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(new Solution().numSquares(12));
    }
}
