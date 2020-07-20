package priv.nightree.algorithm.binarysearch.n153;

class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        int m;
        while (l < h) {
            m = l + (h - l) / 2;
            if (nums[m] < nums[h]) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(new Solution().findMin(nums));
    }
}
