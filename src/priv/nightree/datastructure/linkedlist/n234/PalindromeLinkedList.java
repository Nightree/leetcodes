package priv.nightree.datastructure.linkedlist.n234;

import priv.nightree.util.ListNode;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode one = head, two = head.next;
        while (two.next != null && two.next.next != null) {
            one = one.next;
            two = two.next.next;
        }
        if (two.next != null) {
            two = two.next;
        }
        ListNode linkedList2 = reverse(one.next);
        one.next = null;
        ListNode linkedList1 = head;
        while (linkedList1 != null) {
            if (linkedList1.val == linkedList2.val) {
                linkedList1 = linkedList1.next;
                linkedList2 = linkedList2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode res = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return res;
//        ListNode temp = new ListNode(0);
//        while (node != null) {
//            ListNode nextNode = node.next;
//            node.next = temp.next;
//            temp.next = node;
//            node = nextNode;
//        }
//        return temp.next;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 2, 1});
        System.out.println(new Solution().isPalindrome(head));
    }
}
