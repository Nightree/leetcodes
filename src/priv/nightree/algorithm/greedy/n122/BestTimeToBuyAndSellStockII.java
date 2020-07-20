package priv.nightree.algorithm.greedy.n122;

class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                res = res + prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new Solution().maxProfit(prices));
    }
}
