package priv.nightree.swordoffer.n63;

public class N63 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, temp = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            temp += prices[i + 1] - prices[i];
            if (temp < 0) {
                temp = 0;
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
