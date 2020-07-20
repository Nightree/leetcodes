package priv.nightree.swordoffer.n28;

import priv.nightree.util.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode left = mirror(root.left);
        return check(left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }
        return check(left.left, right.left) && check(left.right, right.right);
    }

    private TreeNode mirror(TreeNode left) {
        if (left == null) {
            return null;
        }
        TreeNode temp = left.left;
        left.left = left.right;
        left.right = temp;
        mirror(left.left);
        mirror(left.right);
        return left;
    }
}

public class N28 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{1, 2, 2, 3, 4, 4, 3});
        System.out.println(new Solution().isSymmetric(root));

    }
}
