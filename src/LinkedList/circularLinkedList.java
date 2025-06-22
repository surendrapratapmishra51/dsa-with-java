package LinkedList;
class cNode{
    int val;
    cNode head;
    cNode tail;
    cNode next;
    cNode prev;
    cNode(int val){
        this.val = val;
    }

}
class CLL {
    cNode head;
    cNode tail;
    int size;

    void display() {
        cNode temp = head;
        do {
            System.out.print(temp.val);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    void insertAtTail(int val) {
        cNode temp = new cNode(val);
        if (size == 0) head = tail = temp;
        else {
            temp.next = temp;
            temp = temp.next;
            tail = temp;
            tail.next = head;
        }
    }
}

    public class circularLinkedList {
        public static void print(cNode head) {
            cNode temp = head;
            do {
                System.out.print(temp.val + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        public static void main(String[] args) {
//        cNode a = new cNode(10);
//    cNode b = new cNode(20);
//    cNode c = new cNode(30);
//    cNode d = new cNode(40);
//    cNode e = new cNode(50);
//    a.next = b; b.prev = a;
//    b.next = c; c.prev = b;
//    c.next = d; d.prev = c;
//    d.next = e; e.prev = d;
//    e.next = a; a.prev = e;
            //print(a);
            CLL list = new CLL();
            list.insertAtTail(10);
            list.insertAtTail(20);
            list.display();
        }
    }