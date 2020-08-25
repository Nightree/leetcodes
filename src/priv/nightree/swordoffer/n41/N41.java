package priv.nightree.swordoffer.n41;

import java.util.PriorityQueue;

class MedianFinder {

    private PriorityQueue<Integer> lesser;
    private PriorityQueue<Integer> greater;

    public MedianFinder() {
        greater = new PriorityQueue<>();
        lesser = new PriorityQueue<>((x, y) -> y - x);
    }

    public void addNum(int num) {
        if (lesser.size() == greater.size()) {
            greater.offer(num);
            lesser.offer(greater.poll());
        } else {
            lesser.offer(num);
            greater.offer(lesser.poll());
        }
    }

    public double findMedian() {
        return lesser.size() == greater.size() ? (lesser.peek() + greater.peek()) / 2.0 : lesser.peek();
    }
}

public class N41 {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(3);
        medianFinder.addNum(4);
        System.out.println(medianFinder.findMedian());
    }
}
