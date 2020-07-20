package priv.nightree.datastructure.linkedlist.n328;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head, even = head.next, evenHead = even;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = even.next;
            if (odd.next == null) {
                break;
            }
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        even.next = null;
        return head;
    }
}

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode res = new Solution().oddEvenList(head);
        ListNode.showListNode(res);
    }
}
