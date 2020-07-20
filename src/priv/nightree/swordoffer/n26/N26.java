package priv.nightree.swordoffer.n26;

import priv.nightree.util.TreeNode;

class Solution {
    public boolean isSubStructure(TreeNode a, TreeNode b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.val == b.val) {
            if (check(a, b)) {
                return true;
            }
        }
        return isSubStructure(a.left, b) || isSubStructure(a.right, b);
    }

    public boolean check(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        } else if (a == null || a.val != b.val) {
            return false;
        }
        return check(a.left, b.left) && check(a.right, b.right);
    }
}

public class N26 {
    public static void main(String[] args) {
        TreeNode a = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 4, 5, 1, 2});
        TreeNode b = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, -1, 5});
        System.out.println(new Solution().isSubStructure(a, b));
    }
}
