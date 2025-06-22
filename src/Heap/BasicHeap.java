package Heap;

import java.util.PriorityQueue;

public class BasicHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq +"top element =  "+pq.peek());
        pq.add(6);
        System.out.println(pq+"top element =  "+pq.peek());
        pq.add(1);
        System.out.println(pq+"top element =  "+pq.peek()+" size = "+pq.size());
        pq.remove();
        System.out.println(pq+"top element =  "+pq.peek());
        pq.poll();
        System.out.println(pq+"top element =  "+pq.peek());

    }
}
