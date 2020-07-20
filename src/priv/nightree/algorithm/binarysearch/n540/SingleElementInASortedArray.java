package priv.nightree.algorithm.binarysearch.n540;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        int m;
        while (l < h) {
            m = l + (h - l) / 2;
            if (m % 2 == 1) {
                m--;
            }
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            } else {
                h = m;
            }
        }
        return nums[l];
    }
}

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(new Solution().singleNonDuplicate(nums));
    }
}
