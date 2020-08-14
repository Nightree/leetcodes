package priv.nightree.basic.array;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findSubArray(arr, arr.length - 1, temp, res);
        System.out.println(res);
    }

    public static void findSubArray(int[] arr, int k, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == 2) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = k; i >= 0; i--) {
            temp.add(arr[i]);
            findSubArray(arr, i - 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

}
