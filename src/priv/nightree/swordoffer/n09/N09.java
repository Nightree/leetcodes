package priv.nightree.swordoffer.n09;

import java.util.Stack;
class CQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            return stack2.pop();
        }
    }
}


public class N09 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());

    }
}
