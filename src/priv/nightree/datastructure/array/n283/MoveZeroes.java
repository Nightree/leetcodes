package priv.nightree.datastructure.array.n283;

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, temp;
        while (i < nums.length && j < nums.length) {
            while (i < nums.length && nums[i] == 0) {
                i++;
            }
            while (j < nums.length && nums[j] != 0) {
                j++;
            }
            if (i < nums.length && j < nums.length && i > j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {4, 0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
