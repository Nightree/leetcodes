package priv.nightree.datastructure.linkedlist.n445;

import priv.nightree.util.ListNode;

import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode res = new ListNode(0);
        int c = 0;
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        while (!s1.isEmpty() || !s2.isEmpty() || c != 0) {
            int t1 = s1.isEmpty() ? 0 : s1.pop(), t2 = s2.isEmpty() ? 0 : s2.pop();
            ListNode node = new ListNode((t1 + t2 + c) % 10);
            node.next = res.next;
            res.next = node;
            c = (t1 + t2 + c) / 10;
        }
        return res.next;
    }
}

public class AddTwoNumbersII {
    public static void main(String[] args) {
        ListNode l1 = ListNode.createListNode(new int[]{3, 2, 4, 5});
        ListNode l2 = ListNode.createListNode(new int[]{3});
        ListNode res = new Solution().addTwoNumbers(l1, l2);
        ListNode.showListNode(res);
    }
}
