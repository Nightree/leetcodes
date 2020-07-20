package priv.nightree.swordoffer.n68one;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = root;
        List<TreeNode> pPath = new ArrayList<>();
        List<TreeNode> qPath = new ArrayList<>();
        findNode(root, p, pPath);
        findNode(root, q, qPath);
        for (int i = 0; i < pPath.size() && i < qPath.size(); i++) {
            if (pPath.get(i) == qPath.get(i)) {
                res = pPath.get(i);
            } else {
                break;
            }
        }
        return res;
    }

    private boolean findNode(TreeNode root, TreeNode node, List<TreeNode> path) {
        if (root == null) {
            return false;
        } else if (root == node) {
            path.add(root);
            return true;
        }
        path.add(root);
        if (findNode(root.left, node, path)) {
            return true;
        } else if (findNode(root.right, node, path)) {
            return true;
        }
        path.remove(root);
        return false;
    }
}

public class N68One {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNodeByBreadthFirst(new int[]{6, 2, 8, 0, 4, 7, 9, -1, -1, 3, 5});
        TreeNode res = new Solution().lowestCommonAncestor(root, root.left.right.right, root.left.left);
        System.out.println(res.val);
    }
}
