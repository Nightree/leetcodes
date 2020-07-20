package priv.nightree.algorithm.search.backtracking.n79;

class Solution {

    private int[][] directions = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    private boolean[][] flags;

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        flags = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j]) {
                    if (recursion(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean recursion(char[][] board, int i, int j, String word, int index) {
        flags[i][j] = true;
        if (board[i][j] != word.charAt(index)) {
            flags[i][j] = false;
            return false;
        }
        if (index == word.length()-1) {
            return true;
        }
        for (int[] direction : directions) {
            if (i + direction[0] >= 0 && i + direction[0] < board.length
                    && j + direction[1] >= 0 && j + direction[1] < board[0].length
                    && !flags[i + direction[0]][j + direction[1]]
                    && recursion(board, i + direction[0], j + direction[1], word, index + 1)) {
                return true;
            }

        }
        flags[i][j] = false;
        return false;
    }
}

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'C', 'A', 'A'},
                {'A', 'A', 'A'},
                {'B', 'C', 'D'}
        };
        char[][] b = {{'a','b'}};
        System.out.println(new Solution().exist(board,"AAB"));
    }
}
