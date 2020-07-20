package priv.nightree.algorithm.binarysearch.n34;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = this.findFst(nums, target);
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }
        int last = this.findFst(nums, target + 1) - 1;
        return new int[]{first, last};
    }

    public int findFst(int[] nums, int target) {
        int l = 0, h = nums.length;
        int m;
        while (l < h) {
            m = l + (h - l) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return l;
    }
}

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(new Solution().searchRange(nums, 8)));
    }
}
