package priv.nightree.algorithm.search.backtracking.n51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private int n;
    private char[][] board;
    private boolean[] colsCheck;
    private boolean[] diagonals45Check;
    private boolean[] diagonals135Check;
    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        colsCheck = new boolean[n];
        diagonals45Check = new boolean[2 * n - 1];
        diagonals135Check = new boolean[2 * n - 1];
        board = new char[n][n];
        res = new ArrayList<>();
        for (char[] chars : board) {
            Arrays.fill(chars, '.');
        }
        backTracking(0);
        return res;
    }

    private void backTracking(int row) {
        if (row == n) {
            List<String> resOne = new ArrayList<>();
            for (char[] chars : board) {
                resOne.add(new String(chars));
            }
            res.add(resOne);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (colsCheck[col] || diagonals45Check[row + col] || diagonals135Check[n - 1 - (row - col)]) {
                continue;
            }
            colsCheck[col] = diagonals45Check[row + col] = diagonals135Check[n - 1 - (row - col)] = true;
            board[row][col] = 'Q';
            backTracking(row + 1);
            colsCheck[col] = diagonals45Check[row + col] = diagonals135Check[n - 1 - (row - col)] = false;
            board[row][col] = '.';
        }
    }
}

public class NQueens {
    public static void main(String[] args) {
        System.out.println(new Solution().solveNQueens(4));
    }
}
