package priv.nightree.swordoffer.n57two;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 1, j = 2, sum = 3;
        while (i < j) {
            if (sum > target) {
                sum -= i;
                i++;
            } else if (sum < target) {
                j++;
                sum += j;
            } else {
                int[] temp = new int[j - i + 1];
                temp[0] = i;
                for (int k = 1; k < temp.length; k++) {
                    temp[k] = temp[k - 1] + 1;
                }
                res.add(temp);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}

public class N57Two {
    public static void main(String[] args) {
        int[][] res = new Solution().findContinuousSequence(10);
        for (int[] r : res) {
            for (int i : r) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
