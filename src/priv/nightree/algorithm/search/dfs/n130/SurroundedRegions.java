package priv.nightree.algorithm.search.dfs.n130;

class Solution {
    private int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return;
        }
        boolean[][] flags = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && (i == 0 || i == board.length - 1 ||
                        j == 0 || j == board[0].length - 1)) {
                    dfs(board, i, j, flags);
                }
            }
        }
        for (int i = 0; i < flags.length; i++) {
            for (int j = 0; j < flags[0].length; j++) {
                if (flags[i][j]) {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int m, int n, boolean[][] flags) {
        if (m < 0 || n < 0 || m > board.length - 1 || n > board[0].length - 1
                || board[m][n] == 'X') {
            return;
        }
        flags[m][n] = true;
        board[m][n] = 'X';
        for (int[] direction : directions) {
            dfs(board, m + direction[0], n + direction[1], flags);
        }
    }
}

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        new Solution().solve(board);
        for (char[] chars : board) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
