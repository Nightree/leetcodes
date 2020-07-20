package priv.nightree.datastructure.tree.dfstraversal.n145;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                res.add(node.val);
                stack.push(node.left);
                stack.push(node.right);
            }
        }
        Collections.reverse(res);
        return res;
    }

}

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3};
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(arr);
        System.out.println(new Solution().postorderTraversal(root));
    }
}
