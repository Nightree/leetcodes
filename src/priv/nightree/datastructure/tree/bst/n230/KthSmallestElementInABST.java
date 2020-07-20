package priv.nightree.datastructure.tree.bst.n230;

import priv.nightree.util.TreeNode;

class Solution {

    private int res = 0;
    private int t = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null || t > k) {
            return 0;
        }

        kthSmallest(root.left, k);
        t++;
        if (k == t) {
            res = root.val;
        }
        kthSmallest(root.right, k);
        return res;
    }
}

public class KthSmallestElementInABST {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 0, 4, -1, 2, -1, -1, 1});
        System.out.println(new Solution().kthSmallest(root, 2));
    }
}
