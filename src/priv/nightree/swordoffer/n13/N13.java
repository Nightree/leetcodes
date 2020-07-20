package priv.nightree.swordoffer.n13;

class Solution {

    private int m, n, k;
    private boolean[][] board;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        board = new boolean[m][n];
        return dfs(0, 0);
    }

    public int dfs(int i, int j) {
        if (i < m && j < n && i / 10 + i % 10 + j / 10 + j % 10 <= k && !board[i][j]) {
            board[i][j] = true;
            return 1 + dfs(i, j + 1) + dfs(i + 1, j);
        } else {
            return 0;
        }
    }
}

public class N13 {
    public static void main(String[] args) {
        System.out.println(new Solution().movingCount(3, 2, 17));
    }
}
