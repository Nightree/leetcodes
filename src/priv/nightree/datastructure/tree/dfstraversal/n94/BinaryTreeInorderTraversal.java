package priv.nightree.datastructure.tree.dfstraversal.n94;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3};
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(arr);
        System.out.println(new Solution().inorderTraversal(root));

    }
}
