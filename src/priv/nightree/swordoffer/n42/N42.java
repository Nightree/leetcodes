package priv.nightree.swordoffer.n42;

class Solution {
    public int maxSubArray(int[] nums) {
        int cur= nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = cur > 0 ? cur + nums[i] : nums[i];
            res = Math.max(res, cur);
        }
        return res;
    }
}

public class N42 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
