package priv.nightree.swordoffer.n39;

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0, cnt = 0;
        for (int num : nums) {
            res = cnt == 0 ? num : res;
            cnt = res == num ? ++cnt : --cnt;
        }
        return res;
    }
}

public class N39 {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));

    }
}
