package priv.nightree.algorithm.math.n169;

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int cnt = 0;
        for (int num : nums) {
            res = cnt == 0 ? num : res;
            cnt = res == num ? ++cnt : --cnt;
        }
        return res;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{2, 3, 4, 4, 4}));
    }
}
