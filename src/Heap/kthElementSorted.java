package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kthElementSorted {
    public static void print(int [] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {6,5,3,2,8,10,9};
        int k = 3;
        print(arr);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k)
                ans.add(pq.remove());
        }
            while(pq.size()>0)
                ans.add(pq.remove());

        System.out.println(ans+" ");

    }
}
