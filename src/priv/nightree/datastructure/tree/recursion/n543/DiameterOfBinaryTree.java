package priv.nightree.datastructure.tree.recursion.n543;

import priv.nightree.util.TreeNode;

class Solution {

    private int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        longest(root);
        return res;
    }

    public int longest(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = longest(node.left);
        int right = longest(node.right);
        res = Math.max(res, 2 + left + right);

        return Math.max(left, right) + 1;
    }

}

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        System.out.println(new Solution().diameterOfBinaryTree(TreeNode.createTreeNodeByBreadthFirst(new int[]{1, -1, 3, 4, 5})));
    }
}
