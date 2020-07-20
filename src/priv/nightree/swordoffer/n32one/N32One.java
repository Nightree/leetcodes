package priv.nightree.swordoffer.n32one;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        res.add(root.val);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                queue.add(temp.left);
                res.add(temp.left.val);
            }
            if (temp.right != null) {
                queue.add(temp.right);
                res.add(temp.right.val);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

}

public class N32One {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{3, 9, 20, -1, -1, 15, 7});
        int[] res = new Solution().levelOrder(root);
        for (int r : res) {
            System.out.print(r + "\t");
        }
    }
}
