package priv.nightree.algorithm.sort.n451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freMap.put(s.charAt(i), freMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for (Character key : freMap.keySet()) {
            if (buckets[freMap.get(key)] == null) {
                buckets[freMap.get(key)] = new ArrayList<>();
            }
            buckets[freMap.get(key)].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] == null) {
                continue;
            }
            for (Character ch : buckets[i]) {
                for (int n = i; n > 0; n--) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(new Solution().frequencySort(str));
    }

}
