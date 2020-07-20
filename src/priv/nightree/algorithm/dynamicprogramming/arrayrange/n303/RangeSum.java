package priv.nightree.algorithm.dynamicprogramming.arrayrange.n303;

class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            this.nums[i] = this.nums[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return this.nums[j + 1] - this.nums[i];
    }
}

public class RangeSum {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1, 3, 5, 6});
        System.out.println(numArray.sumRange(0, 2));
    }
}
