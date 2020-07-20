package priv.nightree.algorithm.greedy.n121;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int res = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - buy > res) {
                res = prices[i] - buy;
            } else if (prices[i] - buy < 0) {
                buy = prices[i];
            }
        }
        return Math.max(res, 0);
    }
}

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new Solution().maxProfit(prices));
    }
}
