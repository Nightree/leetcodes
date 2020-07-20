package priv.nightree.datastructure.linkedlist.n160;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA, t2 = headB;
        while (t1 != t2) {
            t1 = t1 == null ? headB : t1.next;
            t2 = t2 == null ? headA : t2.next;
        }
        return t1;
    }
}

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode headA = ListNode.createListNode(new int[]{1, 2, 3, 4});
        ListNode headB = ListNode.createListNode(new int[]{7, 9}).next = headA.next.next;
        System.out.println(new Solution().getIntersectionNode(headA, headB).val);

    }
}
