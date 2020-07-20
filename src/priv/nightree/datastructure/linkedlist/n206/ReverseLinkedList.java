package priv.nightree.datastructure.linkedlist.n206;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(new int[]{1, 2, 3, 4});
        ListNode.showListNode(new Solution().reverseList(listNode));
    }
}
