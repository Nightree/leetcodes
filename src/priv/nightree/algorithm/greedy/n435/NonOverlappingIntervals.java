package priv.nightree.algorithm.greedy.n435;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
//        Arrays.sort(intervals, (o1,o2)->(o1[1] - o2[1]));
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }
}

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{2, 3}, {1, 2}, {3, 4}, {1, 3}};
        System.out.println(new Solution().eraseOverlapIntervals(intervals));
        System.out.println(Arrays.deepToString(intervals));
    }
}
