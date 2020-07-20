package priv.nightree.datastructure.tree.dfstraversal.n144;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                res.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return res;
    }
}

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3};
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(arr);
        System.out.println(new Solution().preorderTraversal(root));
    }
}
