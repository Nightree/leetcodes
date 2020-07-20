package priv.nightree.swordoffer.n29;

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int row = matrix.length;
        int column = matrix[0].length;
        int cnt;
        int i = 0, j = 0, resIndex = 0;
        while (row > 0 && column > 0) {
            cnt = column;
            while (column-- > 0) {
                res[resIndex++] = matrix[i][j++];
            }
            if (resIndex == res.length) {
                break;
            }
            column = cnt;
            j--;
            i++;
            row--;
            cnt = row;
            while (row-- > 0) {
                res[resIndex++] = matrix[i++][j];
            }
            if (resIndex == res.length) {
                break;
            }
            row = cnt;
            i--;
            j--;
            column--;
            cnt = column;
            while (column-- > 0) {
                res[resIndex++] = matrix[i][j--];
            }
            if (resIndex == res.length) {
                break;
            }
            column = cnt;
            j++;
            i--;
            row--;
            cnt = row;
            while (row-- > 0) {
                res[resIndex++] = matrix[i--][j];
            }
            if (resIndex == res.length) {
                break;
            }
            row = cnt;
            i++;
            j++;
            column--;
        }
        return res;
    }
}

public class N29 {
    public static void main(String[] args) {
        int[] res = new Solution().spiralOrder(new int[][]{
                {1, 2, 3, 1},
                {4, 5, 6, 2},
                {7, 8, 9, 3},
        });
        for (int r : res) {
            System.out.print(r + "\t");
        }
    }
}
