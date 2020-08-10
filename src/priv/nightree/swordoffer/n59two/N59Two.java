package priv.nightree.swordoffer.n59two;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {

    private Queue<Integer> queue;
    private Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.pollLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        if (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (poll.equals(deque.peekFirst())) {
                deque.pollFirst();
            }
            return poll;
        } else {
            return -1;
        }
    }
}


public class N59Two {
    public static void main(String[] args) {
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(3);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());
    }
}
