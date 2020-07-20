package priv.nightree.swordoffer.n53one;

class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target) - binarySearch(nums, target - 1);

    }

    private int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length, mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

public class N53One {
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}
