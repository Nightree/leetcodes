package priv.nightree.datastructure.bitoperation.n461;

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(1, 4));
    }
}
