package priv.nightree.basic.linkedlist;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode copyRandomList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode newHead = new ListNode(head.val);
        ListNode newCur = newHead;
        ListNode cur = head;
        while(cur.next != null){
            newCur.next = new ListNode(cur.next.val);
            newCur = newCur.next;
            cur = cur.next;
        }
        return newHead;
    }
}

public class CopyLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1, 3, 2, 4});
        ListNode res = new Solution().copyRandomList(head);
        ListNode.showListNode(res);
        ListNode.showListNode(head);
        System.out.println(res == head);
    }
}
