package priv.nightree.datastructure.linkedlist.n83;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val != temp.next.val) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1, 1, 2, 3, 3, 4});
        ListNode res = new Solution().deleteDuplicates(head);
        ListNode.showListNode(res);
    }
}
