package priv.nightree.datastructure.tree.recursion.n226;

import priv.nightree.util.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.right = left;
        root.left = right;
        return root;
    }
}

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{1, 2, 3, -1, -1, 4});
        TreeNode res = new Solution().invertTree(root);
        TreeNode.showTreeNodeByPreOrder(res);

    }
}
