package priv.nightree.swordoffer.n34;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> res1 = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return new ArrayList<>();
        }
        res1.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(res1));
        }
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        res1.remove(res1.size() - 1);
        return res;
    }
}

public class N34 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, 5, 1});
        List<List<Integer>> res = new Solution().pathSum(root, 22);
        for (List<Integer> r : res) {
            for (Integer r1 : r) {
                System.out.print(r1+"\t");
            }
            System.out.println();
        }
    }
}
