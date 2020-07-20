package priv.nightree.datastructure.tree.recursion.n437;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private int res = 0;
    private List<Integer> list = new ArrayList<>();

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        list.add(root.val);
        int t = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            t += list.get(i);
            if (t == sum) {
                res++;
            }
        }
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        list.remove(list.size() - 1);
        return res;
    }
}

public class PathSumIII {
    public static void main(String[] args) {
        System.out.println(new Solution().pathSum(TreeNode.createTreeNodeByBreadthFirst(new int[]{10, 5, -3, 3, 2, -1, 11, 3, -2, -1, 1}), 8));
    }
}
