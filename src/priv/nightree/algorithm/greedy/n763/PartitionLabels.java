package priv.nightree.algorithm.greedy.n763;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String str) {
        int start = 0, end = 0;
        List<Integer> res = new ArrayList<>();
        while (start < str.length()) {
            end = str.lastIndexOf(str.charAt(start));
            for (int i = start; i < end; i++) {
                end = Math.max(end, str.lastIndexOf(str.charAt(i)));
            }
            res.add(end - start + 1);
            start = end + 1;
        }
        return res;
    }
}

public class PartitionLabels {
    public static void main(String[] args) {
        String str = "ababcbacadefegdehijhklij";
        List<Integer> res = new Solution().partitionLabels(str);
        for (Integer r : res) {
            System.out.println(r);
        }
    }
}
