package priv.nightree.datastructure.tree.recursion.n110;

import priv.nightree.util.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -2;
    }

    public int height(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = height(node.left);
        if (left == -2) {
            return -2;
        }
        int right = height(node.right);
        if (right == -2) {
            return -2;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -2;
    }
}

public class BalancedBinaryTree {
    public static void main(String[] args) {
        System.out.println(new Solution().isBalanced(TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 9, 20, -1, -1, 15, 7})));

    }
}
