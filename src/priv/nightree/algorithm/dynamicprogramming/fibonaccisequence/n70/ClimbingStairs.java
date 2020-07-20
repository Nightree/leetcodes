package priv.nightree.algorithm.dynamicprogramming.fibonaccisequence.n70;

class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                res = first;
            } else if (i == 2) {
                res = second;
            } else {
                res = first + second;
                first = second;
                second = res;
            }
        }
        return res;
    }
}

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(3));

    }
}
