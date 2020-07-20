package priv.nightree.algorithm.twopointers.n88;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums.add(nums1[i]);
                i++;
            } else {
                nums.add(nums2[j]);
                j++;
            }
        }
        while (i < m) {
            nums.add(nums1[i]);
            i++;
        }
        while (j < n) {
            nums.add(nums2[j]);
            j++;
        }
        for (int t = 0; t < nums.size(); t++) {
            nums1[t] = nums.get(t);
        }
    }
}

public class MergeSortedArray {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            line = in.readLine();
            int n = Integer.parseInt(line);

            new Solution().merge(nums1, m, nums2, n);
            String out = integerArrayToString(nums1);

            System.out.print(out);
        }
    }
}
