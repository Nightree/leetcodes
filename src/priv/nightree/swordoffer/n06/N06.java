package priv.nightree.swordoffer.n06;

import priv.nightree.util.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            res.add(cur.val);
            cur = cur.next;
        }
        Collections.reverse(res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class N06 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        ListNode head = ListNode.createListNode(arr);
        int[] res = new Solution().reversePrint(head);
        for (int a : res) {
            System.out.println(a);
        }
    }
}
