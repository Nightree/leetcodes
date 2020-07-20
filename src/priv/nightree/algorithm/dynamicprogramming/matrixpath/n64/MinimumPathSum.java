package priv.nightree.algorithm.dynamicprogramming.matrixpath.n64;

import java.util.Arrays;

class Solution {

    private int[][] memo;

    public int minPathSum(int[][] grid) {
        memo = new int[grid.length][grid[0].length];
        for (int[] m : memo) {
            Arrays.fill(m, Integer.MAX_VALUE);
        }
        return dp(grid, grid.length - 1, grid[0].length - 1);
    }

    public int dp(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) {
            return grid[0][0];
        }
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[i][j] == Integer.MAX_VALUE) {
            int t1 = dp(grid, i - 1, j);
            int t2 = dp(grid, i, j - 1);
            memo[i][j] = Math.min(t1, t2);
            return Math.min(t1, t2) + grid[i][j];
        } else {
            return memo[i][j] + grid[i][j];
        }

    }
}

public class MinimumPathSum {
    public static void main(String[] args) {
        System.out.println(new Solution().minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }));
    }
}
