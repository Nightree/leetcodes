package priv.nightree.swordoffer.n07;

import priv.nightree.util.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode sRoot = new TreeNode(preorder[0]);
        int[] lPreorder, rPreorder, lInorder, rInorder;
        for (int i = 0; i < inorder.length; i++) {
            if (sRoot.val == inorder[i]) {
                lInorder = new int[i];
                lPreorder = new int[i];
                System.arraycopy(inorder, 0, lInorder, 0, i);
                System.arraycopy(preorder, 1, lPreorder, 0, i);
                rInorder = new int[inorder.length - i - 1];
                rPreorder = new int[inorder.length - i - 1];
                System.arraycopy(inorder, i + 1, rInorder, 0, inorder.length - i - 1);
                System.arraycopy(preorder, i + 1, rPreorder, 0, inorder.length - i - 1);
                sRoot.left = buildTree(lPreorder, lInorder);
                sRoot.right = buildTree(rPreorder, rInorder);
                break;
            }
        }
        return sRoot;
    }
}

public class N07 {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = new Solution().buildTree(preorder, inorder);
        TreeNode.showTreeNodeByBreadthFirst(root);

    }
}
