package priv.nightree.algorithm.dynamicprogramming.fibonaccisequence.n213;

import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robLine(Arrays.copyOfRange(nums, 1, nums.length)), robLine(Arrays.copyOfRange(nums, 0, nums.length - 1)));
    }

    public int robLine(int[] nums) {
        int preOne = 0, preTwo = 0, res = 0;
        for (int num : nums) {
            res = Math.max(preOne, preTwo + num);
            preTwo = preOne;
            preOne = res;
        }
        return res;
    }
}

public class HouseRobberII {
    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));

    }
}
