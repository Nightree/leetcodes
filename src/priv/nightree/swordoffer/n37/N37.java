package priv.nightree.swordoffer.n37;

import priv.nightree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        List<String> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (poll == null) {
                list.add("null");
                continue;
            }
            list.add(String.valueOf(poll.val));
            queue.offer(poll.left);
            queue.offer(poll.right);
        }
        int i = list.size() - 1;
        while (i >= 0) {
            if (!list.get(i).equals("null")) {
                break;
            }
            i--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[").append(list.get(0));
        for (int j = 1; j <= i; j++) {
            stringBuilder.append(",").append(list.get(j));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }
        String[] split = data.substring(1, data.length() - 1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        queue.offer(root);
        int i = 1;
        while (i < split.length) {
            TreeNode poll = queue.poll();
            if (!split[i].equals("null")) {
                poll.left = new TreeNode(Integer.parseInt(split[i]));
                queue.offer(poll.left);
            } else {
                poll.left = null;
            }
            i++;
            if (i == split.length) {
                break;
            }
            if (!split[i].equals("null")) {
                poll.right = new TreeNode(Integer.parseInt(split[i]));
                queue.offer(poll.right);
            } else {
                poll.right = null;
            }
            i++;
        }
        return root;
    }
}

public class N37 {
    public static void main(String[] args) {
        TreeNode root = new Codec().deserialize("[1,2,3,null,null,4,5]");
        TreeNode.showTreeNodeByBreadthFirst(root);
        String res = new Codec().serialize(root);
        System.out.println(res);
    }
}

