package priv.nightree.algorithm.twopointers.n141;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode n1 = head;
        ListNode n2 = head.next;
        while (!(n2 == null || n2.next == null || n2.next.next == null)) {
            if (n1 == n2) {
                return true;
            }
            n1 = n1.next;
            n2 = n2.next.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input, int pos) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        ListNode posNode = new ListNode(100);
        int i=0;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            if (i == pos) {
                posNode = ptr.next;
            }
            ptr = ptr.next;
            i++;
        }
        ptr.next = posNode;
        return dummyRoot.next;
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String strHead = line;
            line = in.readLine();
            int pos = Integer.parseInt(line);
            ListNode head = stringToListNode(strHead, pos);

            boolean ret = new Solution().hasCycle(head);

            String out = booleanToString(ret);

            System.out.print(out);

            System.out.println(head.val);
            for (int i = 0; i < 10; i++) {
                System.out.println(head.next.val);
                head = head.next;
            }
        }
    }
}
