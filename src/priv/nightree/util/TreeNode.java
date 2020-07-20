package priv.nightree.util;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode createTreeNodeByBreadthFirst(int[] arr) {
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode node = queue.remove();
            if (arr[i] != -1) {
                node.left = new TreeNode(arr[i]);
                queue.add(node.left);
            }
            i++;
            if (i == arr.length) {
                break;
            }
            if (arr[i] != -1) {
                node.right = new TreeNode(arr[i]);
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }

    public static void showTreeNodeByBreadthFirst(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.println(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
    }

    public static void showTreeNodeByPreOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            showTreeNodeByPreOrder(root.left);
            showTreeNodeByPreOrder(root.right);
        }
    }

    public static void showTreeNodeByInOrder(TreeNode root) {
        if (root != null) {
            showTreeNodeByInOrder(root.left);
            System.out.println(root.val);
            showTreeNodeByInOrder(root.right);
        }
    }

    public static void showTreeNodeByPostOrder(TreeNode root) {
        if (root != null) {
            showTreeNodeByPostOrder(root.left);
            showTreeNodeByPostOrder(root.right);
            System.out.println(root.val);
        }
    }
}

