package priv.nightree.datastructure.linkedlist.n725;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode cur = root;
        int length = 0;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        ListNode[] res = new ListNode[k];
        ListNode start = root, temp = start;
        int mod = length % k;
        for (int i = 0; i < res.length; i++) {
            int splitLength = mod > 0 ? length / k + 1 : length / k;
            mod--;
            res[i] = start;
            while (splitLength-- > 1) {
                temp = temp.next;
            }
            if (temp != null) {
                start = temp.next;
                temp.next = null;
                temp = start;
            }
        }
        return res;
    }
}

public class SplitLinkedListInParts {
    public static void main(String[] args) {
        ListNode root = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode[] res = new Solution().splitListToParts(root, 6);
        for (ListNode r : res) {
            ListNode.showListNode(r);
        }
    }
}
