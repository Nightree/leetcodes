package priv.nightree.datastructure.tree.bst.n669;

import priv.nightree.util.TreeNode;

class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        } else if (root.val < L) {
            return trimBST(root.right, L, R);
        } else if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

}

public class TrimABinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 0, 4, -1, 2, -1, -1, 1});
        TreeNode.showTreeNodeByInOrder(new Solution().trimBST(root, 1, 3));
    }
}
