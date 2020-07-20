package priv.nightree.algorithm.dynamicprogramming.fibonaccisequence.n198;

class Solution {
    public int rob(int[] nums) {
        int preOne = 0, preTwo = 0, res = 0;
        for (int num : nums) {
            res = Math.max(preOne, preTwo + num);
            preTwo = preOne;
            preOne = res;
        }
        return res;
    }
}

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{2, 7, 9, 3, 1}));

    }
}
