package priv.nightree.datastructure.tree.recursion.n104;

import priv.nightree.util.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return 0;
    }
}

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 6, 7, -1, -1, 8};

        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(arr);
        System.out.println(new Solution().maxDepth(root));

    }

}
