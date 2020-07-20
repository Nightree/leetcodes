package priv.nightree.swordoffer.n56one;

class Solution {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        diff &= -diff;
        for (int num : nums) {
            if ((num & diff) == 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }
}

public class N56One {
    public static void main(String[] args) {
        int[] res = new Solution().singleNumbers(new int[]{1, 2, 10, 4, 1, 4, 3, 3});
        for (int r : res) {
            System.out.println(r);
        }
    }
}
