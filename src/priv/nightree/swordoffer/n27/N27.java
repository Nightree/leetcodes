package priv.nightree.swordoffer.n27;

import priv.nightree.util.TreeNode;

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}

public class N27 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 4, 5, 1, 2, 7, 8});
        TreeNode res = new Solution().mirrorTree(root);
        TreeNode.showTreeNodeByBreadthFirst(res);

    }
}
