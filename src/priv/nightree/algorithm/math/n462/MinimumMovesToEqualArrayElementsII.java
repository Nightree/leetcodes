package priv.nightree.algorithm.math.n462;

class Solution {
    public int minMoves2(int[] nums) {
        int mid = findMid(nums);
        int res = 0;
        for (int num : nums) {
            res += Math.abs(num - mid);
        }
        return res;
    }

    private int findMid(int[] nums) {
        int i = 0, j = nums.length - 1;
        int m = nums.length / 2;
        while (i <= j) {
            int k = partition(nums, i, j);
            if (k == m) {
                return nums[m];
            } else if (k < m) {
                i = k + 1;
            } else {
                j = k - 1;
            }
        }
        return nums[j];
    }

    private int partition(int[] nums, int i, int j) {
        int l = i;
        while (i <= j) {
            while (i <= j && nums[i] <= nums[l]) {
                i++;
            }
            while (i <= j && nums[j] >= nums[l]) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class MinimumMovesToEqualArrayElementsII {
    public static void main(String[] args) {
        System.out.println(new Solution().minMoves2(new int[]{1,4,2}));
    }
}
