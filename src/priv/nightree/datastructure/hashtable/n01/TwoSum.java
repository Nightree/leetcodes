package priv.nightree.datastructure.hashtable.n01;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] res = new Solution().twoSum(new int[]{2, 3, 5, 7}, 8);
        for (int r : res) {
            System.out.println(r);
        }
    }
}
