package priv.nightree.swordoffer.n25;

import priv.nightree.util.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
        }
        return l1.val < l2.val ? l1 : l2;
    }
}

//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null || l2 == null) {
//            return l1 == null ? l2 : l1;
//        }
//        ListNode res;
//        ListNode cur;
//        if (l1.val < l2.val) {
//            res = l1;
//            l1 = l1.next;
//        } else {
//            res = l2;
//            l2 = l2.next;
//        }
//        cur = res;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                cur.next = l1;
//                cur = cur.next;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                cur = cur.next;
//                l2 = l2.next;
//            }
//        }
//        if (l1 != null) {
//            cur.next = l1;
//        }
//        if (l2 != null) {
//            cur.next = l2;
//        }
//        return res;
//    }
//}

public class N25 {
    public static void main(String[] args) {
        ListNode l1 = ListNode.createListNode(new int[]{1, 2, 3});
        ListNode l2 = ListNode.createListNode(new int[]{1, 3, 5});
        ListNode res = new Solution().mergeTwoLists(l1, l2);
        ListNode.showListNode(res);

    }
}
