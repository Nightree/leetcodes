package priv.nightree.algorithm.search.bfs.n279;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int numSquares(int n) {
        List<Integer> squares = getSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] flag = new boolean[n + 1];
        int res = 0;
        queue.add(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;
            while (size-- > 0) {
                Integer poll = queue.poll();
                for (Integer square : squares) {
                    int next = poll - square;
                    if (next == 0) {
                        return res;
                    }
                    if (next < 0) {
                        break;
                    }
                    if (flag[next]) {
                        continue;
                    }
                    queue.add(next);
                    flag[next] = true;
                }
            }
        }
        return -1;
    }

    public List<Integer> getSquares(int n) {
        List<Integer> res = new ArrayList<>();
        int square = 1, c = 3;
        while (square <= n) {
            res.add(square);
            square += c;
            c += 2;
        }
        return res;
    }
}

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(new Solution().numSquares(n));
    }
}
