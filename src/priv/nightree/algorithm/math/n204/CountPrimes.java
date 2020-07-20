package priv.nightree.algorithm.math.n204;

class Solution {
    public int countPrimes(int n) {
        int res = 0;
        boolean[] flags = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (flags[i]) {
                continue;
            }
            for (long j = (long) i * i; j < n; j += i) {
                flags[(int) j] = true;
            }
            res++;
        }
        return res;
    }
}

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(10));

    }
}
