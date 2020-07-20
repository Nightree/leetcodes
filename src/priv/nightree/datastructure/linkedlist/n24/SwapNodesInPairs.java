package priv.nightree.datastructure.linkedlist.n24;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = swapPairs(head.next.next);
        ListNode res = head.next;
        head.next.next = head;
        head.next = node;
        return res;
    }

}

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode res = new Solution().swapPairs(head);
        ListNode.showListNode(res);
    }
}
