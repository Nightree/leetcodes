package priv.nightree.swordoffer.n24;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (head.next != null) {
            ListNode temp = head.next.next;
            head.next.next = node;
            node = head.next;
            head.next = temp;
        }
        return node;
    }
}

public class N24 {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1,2,3,4,5});
        ListNode res = new Solution().reverseList(head);
        ListNode.showListNode(res);

    }
}
