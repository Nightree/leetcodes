package priv.nightree.datastructure.tree.recursion.n112;

import priv.nightree.util.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (root.left == null && root.right == null) {
            return sum == 0;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}

public class PathSum {
    public static void main(String[] args) {
        System.out.println(new Solution().hasPathSum(TreeNode.createTreeNodeByBreadthFirst(new int[]{1, 2, 3, -1, -1, 4}), 3));
    }
}
