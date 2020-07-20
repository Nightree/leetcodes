package priv.nightree.algorithm.greedy.n406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, ((o1, o2) -> o2[0] == o1[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1], people[i]);
        }
        return list.toArray(new int[0][]);
    }
}

public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        System.out.println(Arrays.deepToString(new Solution().reconstructQueue(people)));
    }
}
