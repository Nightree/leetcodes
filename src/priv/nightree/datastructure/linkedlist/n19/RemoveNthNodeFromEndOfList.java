package priv.nightree.datastructure.linkedlist.n19;

import priv.nightree.util.ListNode;

class Solution {

    private int cnt = 0;
    private boolean flag = false;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        removeNthFromEnd(head.next, n);
        cnt++;
        if (n == cnt) {
            head.next = head.next.next;
            flag = true;
        }
        return flag ? head : head.next;
    }
}

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode res = new Solution().removeNthFromEnd(head, 2);
        ListNode.showListNode(res);
    }
}
