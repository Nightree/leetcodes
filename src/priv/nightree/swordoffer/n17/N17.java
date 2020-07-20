package priv.nightree.swordoffer.n17;

class Solution {
    public int[] printNumbers(int n) {
        int[] res = new int[(int) Math.pow(10, n) - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}

public class N17 {
    public static void main(String[] args) {
        for (int i : new Solution().printNumbers(2)) {
            System.out.print(i + "\t");
        }

    }
}
