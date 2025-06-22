package Stack;

public class LinkedList_Implementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int size(){
            return size;
        }
        int pop(){
            if(head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
                int x = head.val;
                head = head.next;
                size--;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
            }
            int x = head.val;
            return x;
        }
        boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
        void display(){
            displayRec(head);
        }
        void displayRec(Node h){
            if( h == null) return;
            displayRec(h.next);
            System.out.println(h.val);
        }
    }
    public static void main(String[] args) {
    Stack st = new Stack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);

        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        System.out.println(st.size());
        System.out.println(st.peek());
        st.display();
    }
}
