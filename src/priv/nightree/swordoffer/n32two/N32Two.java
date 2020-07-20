package priv.nightree.swordoffer.n32two;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> res1 = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode temp = queue.poll();
                res1.add(temp.val);
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            res.add(res1);
        }
        return res;
    }
}

public class N32Two {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 9, 20, -1, -1, 15, 7});
        List<List<Integer>> res = new Solution().levelOrder(root);
        for (List<Integer> r : res) {
            for (Integer ri : r) {
                System.out.print(ri+"\t");
            }
            System.out.println();
        }
    }
}
