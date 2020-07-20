package priv.nightree.algorithm.sort.n347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequentMap = new HashMap<>();
        for (int num : nums) {
            frequentMap.put(num, frequentMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (Integer key : frequentMap.keySet()) {
            Integer frequent = frequentMap.get(key);
            if (buckets[frequent] == null) {
                buckets[frequent] = new ArrayList<>();
            }
            buckets[frequent].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = nums.length; i >= 0; i--) {
            if (buckets[i] == null) {
                continue;
            }
            if (res.size() + buckets[i].size() < k) {
                res.addAll(buckets[i]);
            } else {
                res.addAll(buckets[i].subList(0, k - res.size()));
                break;
            }
        }
        return res;
    }
}

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,-1,2,-1,2,3};
        int k = 2;
        List<Integer> list = new Solution().topKFrequent(nums, k);
        System.out.println(list);
    }
}
