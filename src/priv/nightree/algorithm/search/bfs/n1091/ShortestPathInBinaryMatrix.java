package priv.nightree.algorithm.search.bfs.n1091;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int res = 0, n = grid.length;
        int[][] directions = {{1, -1}, {1, 0}, {1, 1}, {0, -1}, {0, 1}, {-1, -1}, {-1, 0}, {-1, 1}};
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0, 0));
        while (queue.size() != 0) {
            int size = queue.size();
            System.out.println(size);
            res++;
            while (size-- > 0) {
                Pair<Integer, Integer> point = queue.poll();
                Integer oldR = point.getKey();
                Integer oldC = point.getValue();
                if (grid[oldR][oldC] == 1) {
                    continue;
                }
                if (oldR == n - 1 && oldC == n - 1) {
                    return res;
                }
                grid[oldR][oldC] = 1;
                for (int[] d : directions) {
                    int newR = oldR + d[0];
                    int newC = oldC + d[1];
                    if (newR < 0 || newR > n - 1 || newC < 0 || newC > n - 1) {
                        continue;
                    }
                    if (grid[newR][newC] == 0) {
                        queue.add(new Pair<>(newR, newC));
                    }
                }
            }
        }
        return -1;
    }
}

public class ShortestPathInBinaryMatrix {
    public static void main(String[] args) {
        long time = System.nanoTime();
        int[][] grid = {{0, 0, 0,0}, {0, 0, 0,0}, {0, 0, 0,0}, {0, 0, 0,0}};
        System.out.println(new Solution().shortestPathBinaryMatrix(grid));
        System.out.println(System.nanoTime()-time);
    }
}
