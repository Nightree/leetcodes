package priv.nightree.algorithm.sort.n215;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int i=0;
        int j = nums.length - 1;
        k = nums.length - k;
        while (i < j) {
            int t = partition(nums, i, j);
            if (t == k) {
                break;
            } else if (t < k) {
                i = t + 1;
            } else {
                j = t - 1;
            }
        }
        return nums[k];
    }

    public int partition(int[] arr, int left, int right) {
        int i = left, j = right+1;
        while (i < j) {
            while (arr[++i] < arr[left] && i < right) ;
            while (arr[--j] > arr[left]) ;
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, left, j);
        return j;
    }

    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}

class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

public class KthElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1};
        int k = 1;
        int res = new Solution().findKthLargest(nums, k);
        System.out.println(res);
    }
}
