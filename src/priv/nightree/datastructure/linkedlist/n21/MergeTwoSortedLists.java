package priv.nightree.datastructure.linkedlist.n21;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res, cur;
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                res = l1;
                l1 = l1.next;
            } else {
                res = l2;
                l2 = l2.next;
            }
            cur = res;
        }
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return res;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = ListNode.createListNode(new int[]{1, 2, 3});
        ListNode l2 = ListNode.createListNode(new int[]{2, 4, 6});
        ListNode res = new Solution().mergeTwoLists(l1, l2);
        ListNode.showListNode(res);
    }
}
