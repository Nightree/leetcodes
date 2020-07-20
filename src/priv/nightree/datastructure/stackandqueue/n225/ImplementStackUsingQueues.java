package priv.nightree.datastructure.stackandqueue.n225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        int i = queue.size();
        while (--i > 0) {
            queue.add(queue.remove());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(2);
        obj.push(4);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);

    }
}
