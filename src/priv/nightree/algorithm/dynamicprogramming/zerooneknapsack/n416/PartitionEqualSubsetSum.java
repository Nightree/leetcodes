package priv.nightree.algorithm.dynamicprogramming.zerooneknapsack.n416;

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
                if (dp[target]) {
                    return true;
                }
            }
        }
        return dp[target];
    }
}

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        System.out.println(new Solution().canPartition(new int[]{23, 13, 11, 7, 6, 5, 5}));
    }
}
