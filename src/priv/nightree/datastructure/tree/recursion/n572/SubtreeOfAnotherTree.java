package priv.nightree.datastructure.tree.recursion.n572;

import priv.nightree.util.TreeNode;

class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        boolean temp=false;
        if (s.val == t.val) {
            temp = compare(s, t);
        }
        return temp||isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean compare(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val == t.val) {
            return compare(s.left, t.left) && compare(s.right, t.right);
        }
        return false;
    }

}

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode s = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 4, 5, 1, 2, -1, -1, 2});
        TreeNode t = TreeNode.createTreeNodeByBreadthFirst(new int[]{4, 1, 2});
        System.out.println(new Solution().isSubtree(s, t));
    }
}
