package priv.nightree.swordoffer.n04;

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < columns; j++) {
                if (target < matrix[i][j]) {
                    break;
                } else if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class N04 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(new Solution().findNumberIn2DArray(matrix, 5));
    }
}
