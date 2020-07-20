package priv.nightree.swordoffer.n03;

class Solution {
    public int findRepeatNumber(int[] nums) {
        int t = -1;
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                t = nums[i];
                if (t == nums[t]) {
                    return t;
                }
                nums[i] = nums[t];
                nums[t] = t;
            }
        }
        return -1;
    }
}

public class N03 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(new Solution().findRepeatNumber(arr));

    }
}
