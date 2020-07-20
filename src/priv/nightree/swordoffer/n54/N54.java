package priv.nightree.swordoffer.n54;

import priv.nightree.util.TreeNode;

class Solution {

    private int res;
    private int cnt;
    
    public int kthLargest(TreeNode root, int k) {
        cnt = k;
        recursion(root);
        return res;
    }

    private void recursion(TreeNode root) {
        if (root == null || cnt == 0) {
            return;
        }
        recursion(root.right);
        if (--cnt == 0) {
            res = root.val;
            return;
        }
        recursion(root.left);
    }
}

public class N54 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{5, 3, 6, 2, 4, -1, -1, 1});
        System.out.println(new Solution().kthLargest(root, 3));
    }
}
