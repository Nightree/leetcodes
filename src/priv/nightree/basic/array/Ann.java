package priv.nightree.basic.array;

import java.util.ArrayList;
import java.util.List;

public class Ann {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findAnn(arr, temp, res);
        System.out.println(res);

    }

    public static void findAnn(int[] arr, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == arr.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int a : arr) {
            if (temp.contains(a)) {
                continue;
            }
            temp.add(a);
            findAnn(arr, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}
