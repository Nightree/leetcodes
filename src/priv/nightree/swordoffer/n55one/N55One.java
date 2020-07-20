package priv.nightree.swordoffer.n55one;

import priv.nightree.util.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return 0;
    }
}

public class N55One {
    public static void main(String[] args) {
        System.out.println(new Solution().maxDepth(TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 9, 20, -1, -1, 15, 7})));
    }
}
