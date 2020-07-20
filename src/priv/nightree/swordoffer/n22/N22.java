package priv.nightree.swordoffer.n22;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode i = head, j = head;
        while (k-- > 0) {
            j = j.next;
        }
        while (j != null) {
            i = i.next;
            j = j.next;
        }
        return i;
    }
}

public class N22 {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode res = new Solution().getKthFromEnd(head, 3);
        ListNode.showListNode(res);
    }
}
