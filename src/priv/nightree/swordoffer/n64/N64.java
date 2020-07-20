package priv.nightree.swordoffer.n64;

public class N64 {
    public static void main(String[] args) {
        System.out.println(new Solution().sumNums(9));
    }
}

class Solution {
    public int sumNums(int n) {
        boolean temp = n != 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}

