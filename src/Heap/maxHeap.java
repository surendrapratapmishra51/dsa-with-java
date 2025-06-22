package Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class maxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        System.out.println(pq +"top element =  "+pq.peek());
        pq.add(6);
        pq.add(6);

        System.out.println(pq+"top element =  "+pq.peek());
        pq.remove();
        pq.add(1);
        System.out.println(pq+"top element =  "+pq.peek()+" size = "+pq.size());
        pq.remove();
        System.out.println(pq+"top element =  "+pq.peek());

    }
}