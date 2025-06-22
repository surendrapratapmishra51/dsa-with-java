package LinkedList;

import static LinkedList.ListNodeClass.print;

class sp {
    Node head;
    Node tail;

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }

    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
public class findMidNode {

    public static void main(String[] args) {
       sp list = new sp();
       list.insertAtHead(30);
       list.display();



    }

    }


