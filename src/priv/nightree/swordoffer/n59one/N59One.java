package priv.nightree.swordoffer.n59one;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.peekLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        for (int i = 0, j = k - 1; j < nums.length - 1; i++, j++) {
            res[i] = deque.peekFirst();
            if (nums[i] == deque.peekFirst()) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[j + 1] > deque.peekLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[j + 1]);
        }
        res[res.length - 1] = deque.peekFirst();
        return res;
    }
}

public class N59One {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] res = new Solution().maxSlidingWindow(nums, 3);
        for (int r : res) {
            System.out.print(r + "\t");
        }
    }
}
