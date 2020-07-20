package priv.nightree.algorithm.search.dfs.n695;

class Solution {
    private int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int area = dfs(grid, i, j);
                res = Math.max(res, area);
            }
        }
        return res;

    }

    public int dfs(int[][] grid, int m, int n) {
        if (m < 0 || n < 0 || m > grid.length - 1 || n > grid[0].length - 1 || grid[m][n] == 0) {
            return 0;
        }
        int area = 1;
        grid[m][n] = 0;
        for (int[] direction : directions) {
            area += dfs(grid, m + direction[0], n + direction[1]);
        }
        return area;
    }
}

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        System.out.println(new Solution().maxAreaOfIsland(grid));

    }
}
