package priv.nightree.swordoffer.n53two;

class Solution {
    public int missingNumber(int[] nums) {
        int start = 0, end = nums.length, mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == mid) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}

public class N53Two {
    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{0, 1, 2, 3, 4, 6, 7}));
        System.out.println(new Solution().missingNumber(new int[]{0, 1, 3}));
    }
}
