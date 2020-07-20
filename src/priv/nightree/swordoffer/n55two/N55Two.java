package priv.nightree.swordoffer.n55two;

import priv.nightree.util.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(depth(node.left), depth(node.right));
    }
}

public class N55Two {
    public static void main(String[] args) {
        System.out.println(new Solution().isBalanced(TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 9, 20, -1, -1, 15, 7})));
    }
}
