package priv.nightree.others.lru;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    static class DListNode {
        public int key, value;
        public DListNode next, pre;

        public DListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public int capacity;
    public int size;
    public Map<Integer, DListNode> map;
    public DListNode vHead, vTail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        vHead = new DListNode(-1, -1);
        vTail = new DListNode(-1, -1);
        vHead.next = vTail;
        vTail.pre = vHead;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            DListNode temp = map.get(key);
            map.remove(temp.key);
            temp.next.pre = temp.pre;
            temp.pre.next = temp.next;
            size--;
            put(key, temp.value);
            return map.get(key).value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            get(key);
            DListNode temp = map.get(key);
            temp.value = value;
            return;
        }
        if (size == capacity) {
            map.remove(vHead.next.key);
            vHead.next = vHead.next.next;
            vHead.next.pre = vHead;
            size--;
        }
        DListNode temp = new DListNode(key, value);
        map.put(key, temp);
        vTail.pre.next = temp;
        temp.next = vTail;
        temp.pre = vTail.pre;
        vTail.pre = temp;
        size++;
    }
}

public class LRU {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }
}
