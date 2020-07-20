package priv.nightree.swordoffer.n18;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode res = head;
        ListNode temp = head;
        while (head != null) {
            if (head.val == val) {
                temp.next = head.next;
                break;
            }
            temp = head;
            head = head.next;
        }
        return temp == head ? head.next : res;
    }
}

public class N18 {
    public static void main(String[] args) {
        ListNode res = new Solution().deleteNode(ListNode.createListNode(new int[]{4, 5, 1, 9}), 4);
        ListNode.showListNode(res);

    }
}
