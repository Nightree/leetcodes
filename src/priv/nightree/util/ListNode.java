package priv.nightree.util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createListNode(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void showListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }
        System.out.println();
    }
}
