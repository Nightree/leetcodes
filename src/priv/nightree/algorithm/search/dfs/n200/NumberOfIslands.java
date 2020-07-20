package priv.nightree.algorithm.search.dfs.n200;

class Solution {
    private int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dfs(grid, i, j)) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean dfs(char[][] grid, int m, int n) {
        if (m < 0 || n < 0 || m > grid.length - 1 || n > grid[0].length - 1 || grid[m][n] == '0') {
            return false;
        }
        grid[m][n] = '0';
        for (int[] direction : directions) {
            dfs(grid, m + direction[0], n + direction[1]);
        }
        return true;
    }
}

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(new Solution().numIslands(grid));
    }
}
