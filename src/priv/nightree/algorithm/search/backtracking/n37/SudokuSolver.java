package priv.nightree.algorithm.search.backtracking.n37;

class Solution {
    private boolean[][] rowsCheck = new boolean[9][10];
    private boolean[][] colsCheck = new boolean[9][10];
    private boolean[][] blocksCheck = new boolean[9][10];
    private char[][] board;

    public void solveSudoku(char[][] board) {
        this.board = board;
        int num;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                num = board[i][j] - '0';
                rowsCheck[i][num] = colsCheck[j][num] = blocksCheck[indexBlock(i, j)][num] = true;
            }
        }
        backTracking(0, 0);
    }

    private boolean backTracking(int row, int col) {
        while (row < 9 && board[row][col] != '.') {
            row = col == 8 ? row + 1 : row;
            col = col == 8 ? 0 : col + 1;
        }
        if (row == 9) {
            return true;
        }
        for (int num = 1; num < 10; num++) {
            if (rowsCheck[row][num] || colsCheck[col][num] || blocksCheck[indexBlock(row, col)][num]) {
                continue;
            }
            rowsCheck[row][num] = colsCheck[col][num] = blocksCheck[indexBlock(row, col)][num] = true;
            board[row][col] = (char) (num + '0');
            if (backTracking(row, col)) {
                return true;
            }
            rowsCheck[row][num] = colsCheck[col][num] = blocksCheck[indexBlock(row, col)][num] = false;
            board[row][col] = '.';
        }
        return false;
    }

    private int indexBlock(int row, int col) {
        return row / 3 * 3 + col / 3;
    }
}

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        new Solution().solveSudoku(board);
        for (char[] b : board) {
            System.out.println(b);
        }
    }
}
