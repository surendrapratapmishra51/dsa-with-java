package Heap;
class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        if(size == arr.length){
            System.out.println("Heap is full");
            return;
        }
        arr[size++] = num;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int peek(){
        if(size==0){
            System.out.println("Heap is Empty");
            return -1;
        }
        return arr[0];
    }
    public int size(){
        return size;
    }

    public int remove(){
        if(size == 0){
            System.out.println("heap is empty");
            return -1;
        }
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int i){
        if(i>= size-1) return;
        int lc = 2*i +1; int rc = 2*i +2;
        int minIdx = i;
        if(lc<size && arr[lc]<arr[minIdx]) minIdx = lc;
        if(rc<size && arr[rc]<arr[minIdx]) minIdx = rc;
        if(i == minIdx)return;
        swap(i,minIdx);
        downHeapify(0);
    }
}
public class MinHeapImplementationArray {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap(10);
//        pq.add(1);
//        pq.add(2);
//        pq.add(3);
//        pq.add(4);
//        System.out.println(pq.size());
//        System.out.println(pq.peek());
//        pq.add(0);
//        System.out.println(pq.peek());
//        pq.add(-4);
//        System.out.println(pq.peek() +" "+ pq.size());
//        pq.add(10);
        pq.add(5);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.peek()+" "+ pq.size());
        pq.remove();
        System.out.println(pq.peek()+" "+ pq.size());


    }
}
