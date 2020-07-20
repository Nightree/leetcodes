package priv.nightree.swordoffer.n61;

import java.util.Arrays;

public class N61 {
    public static void main(String[] args) {
        System.out.println(new Solution().isStraight(new int[]{0, 0, 5, 3, 2}));
    }
}

class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (min == 0) {
                min = nums[i];
            }
            if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[nums.length - 1] - min <= 4;
    }
}
