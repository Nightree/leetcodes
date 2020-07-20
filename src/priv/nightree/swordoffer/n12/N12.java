package priv.nightree.swordoffer.n12;

class Solution {

    private int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private boolean[][] flags;

    public boolean exist(char[][] board, String word) {
        flags = new boolean[board.length][board[0].length];
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == words[0]) {
                    flags[i][j] = true;
                    if (!findWord(board, i, j, words, 1)) {
                        flags[i][j] = false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean findWord(char[][] board, int i, int j, char[] words, int index) {
        if (index == words.length) {
            return true;
        }
        for (int[] d : directions) {
            if (i + d[0] < board.length && j + d[1] < board[0].length && i + d[0] >= 0 && j + d[1] >= 0
                    && !flags[i + d[0]][j + d[1]]
                    && board[i + d[0]][j + d[1]] == words[index]) {
                flags[i + d[0]][j + d[1]] = true;
                if (findWord(board, i + d[0], j + d[1], words, ++index)) {
                    return true;
                }
                index--;
                flags[i + d[0]][j + d[1]] = false;
            }
        }
        return false;
    }
}

public class N12 {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        System.out.println(new Solution().exist(board, word));
    }
}
