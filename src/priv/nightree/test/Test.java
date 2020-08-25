package priv.nightree.test;

import priv.nightree.util.TreeNode;

class Solution {

    private int rootVal = 0;
    private long res = Integer.MAX_VALUE + 1;

    public int findSecondMinimumValue(TreeNode root) {
        //    1
        //  1   1
        // 1 1 3 1
        //      1 2
        if(root == null){
            return -1;
        }
        rootVal = root.val;
        inorder(root);
        return res == Integer.MAX_VALUE + 1 ? -1 : (int)res;
    }

    private void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(root.val != rootVal){
            res = Math.min(res, root.val);
        }
        inorder(root.right);
    }
}

public class Test {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{1, 4, 5, 4, 4, 5});
        int res = new Solution().findSecondMinimumValue(root);
        System.out.println(res);
    }
}
