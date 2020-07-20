package priv.nightree.algorithm.greedy.n452;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int res = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                continue;
            }
            end = points[i][1];
            res++;
        }
        return res;
    }
}

public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(new Solution().findMinArrowShots(points));

    }
}
