package priv.nightree.swordoffer.n32three;

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
            LinkedList<Integer> res1 = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode poll = queue.poll();
                if (res.size() % 2 == 0) {
                    res1.addLast(poll.val);
                } else {
                    res1.addFirst(poll.val);
                }
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            res.add(res1);
        }
        return res;
    }
}

public class N32Three {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 9, 20, -1, -1, 15, 7});
        List<List<Integer>> res = new Solution().levelOrder(root);
        for (List<Integer> r : res) {
            for (Integer r1 : r) {
                System.out.print(r1+"\t");
            }
            System.out.println();
        }
    }
}
