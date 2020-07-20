package priv.nightree.swordoffer.n21;

class Solution {
    public int[] exchange(int[] nums) {
        int i = -1, j = nums.length;
        while (i < j - 1) {
            while (i < nums.length - 1 && (nums[++i] & 1) == 1) ;
            while (j > 0 && (nums[--j] & 1) == 0) ;
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}

public class N21 {
    public static void main(String[] args) {
        int[] arr = new Solution().exchange(new int[]{1, 3, 4});
        for (int a : arr) {
            System.out.print(a+"\t");
        }
    }
}
