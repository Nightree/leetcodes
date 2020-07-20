package priv.nightree.algorithm.greedy.n605;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num = 0;
        int zero = 1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                zero++;
            } else {
                num += (zero + 1) / 2 - 1;
                zero = 0;
            }
            if (i == flowerbed.length - 1 && flowerbed[i] == 0) {
                num += (zero + 2) / 2 - 1;
            }
            if (num >= n) {
                return true;
            }
        }
        return false;
    }
}

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 0, 0, 1};
        System.out.println(new Solution().canPlaceFlowers(flowerbed,1));
    }
}
