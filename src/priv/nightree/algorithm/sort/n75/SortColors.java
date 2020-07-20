package priv.nightree.algorithm.sort.n75;

class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) {
                swap(nums,one++,zero++);
            } else if (nums[one] == 2) {
                swap(nums, one, two--);
            } else {
                one++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 2};
        new Solution().sortColors(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
