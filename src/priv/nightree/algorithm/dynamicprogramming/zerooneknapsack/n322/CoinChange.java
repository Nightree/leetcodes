package priv.nightree.algorithm.dynamicprogramming.zerooneknapsack.n322;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] lastBest = new int[amount + 1];
        for (int coin : coins) {
            if (coin > amount) {
                continue;
            }
            lastBest[coin] = 1;
        }
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin > 0 && lastBest[i - coin] != 0) {
                    lastBest[i] = lastBest[i] != 0 ? Math.min(lastBest[i - coin] + 1, lastBest[i]) : lastBest[i - coin] + 1;
                }
            }
        }
        return amount == 0 ? 0 : lastBest[amount] == 0 ? -1 : lastBest[amount];
    }
}

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(new Solution().coinChange(new int[]{1,2,5}, 11));
    }
}
