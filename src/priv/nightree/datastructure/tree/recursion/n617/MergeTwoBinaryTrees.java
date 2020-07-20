package priv.nightree.datastructure.tree.recursion.n617;

import priv.nightree.util.TreeNode;

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

}

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        TreeNode t1 = TreeNode.createTreeNodeByBreadthFirst(new int[]{1, 3, 2, 5});
        TreeNode t2 = TreeNode.createTreeNodeByBreadthFirst(new int[]{2, 1, 3, -1, 4, -1, 7});
        TreeNode.showTreeNodeByBreadthFirst(new Solution().mergeTrees(t1, t2));
    }
}
