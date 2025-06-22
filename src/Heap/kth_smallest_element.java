package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest_element {
    public static void main(String[] args) {
        int [] arr = { 5,6,3,4,-1,-4,-3,9,15};
        int k = 5;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
