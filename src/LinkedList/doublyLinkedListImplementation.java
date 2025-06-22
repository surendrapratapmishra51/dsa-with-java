package LinkedList;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}

class DLL {
    dNode head;
    dNode tail;
    int size;

    void display() {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAttail(int val) {
        dNode temp = new dNode(val);
        if (size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;

    }

    void insertAtHead(int val) {
        dNode temp = new dNode(val);
        if (size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertnode(int idx, int val) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAttail(val);
            return;
        }
        if (idx > size || idx < 0) {
            System.out.println("Invalid Index");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for (int i = 1; i < idx - 1; i++) {
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp;
        temp.prev = x;
        y.prev = temp;
        temp.next = y;
        size++;
    }

    void deleteAtHead() throws Error {
        if (head == null) throw new Error(" List is empty");
        head = head.next;
        head.prev = null;
        size--;
    }

    void deleteAtTail() throws Error {
        if (size == 0) throw new Error("List is empty");
        tail = tail.prev;
        tail.next  = null;
    }
    void deletenode(int idx){
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size){
            deleteAtTail();
            return;
        }
        if(idx>size || idx<0){
            System.out.println(" Invalid index");
            return;
        }
        dNode temp = new dNode(idx);
        dNode x = head;
        for (int i = 1; i < idx - 1; i++) {
            x = x.next;
        }
        x.next = x.next.next;
        x = x.next;
}
public static void print(dNode head){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void reverseprint(dNode tail){
      dNode temp = tail;
      while(temp != null){
          System.out.print(temp.val+" ");
          temp = temp.prev;
      }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node;
        while(temp.prev != null){
            temp = temp.prev;
        }
        // now temp is  at head
        print(temp);
    }
    public static void main(String[] args) {

//    dNode a = new dNode(10);
//    dNode b = new dNode(20);
//    dNode c = new dNode(30);
//    dNode d = new dNode(40);
//    a.next = b; b.prev = a;
//    b.next = c; c.prev = b;
//    c.next = d; d.prev = c;
//    print(a);
//    reverseprint(d);
//    display(c);
        DLL list = new DLL();
        list.display();
        list.insertAttail(10);
        list.insertAttail(30);
        list.insertAttail(40);
        list.insertAttail(50);
        list.display();
        list.insertAttail(90);
        list.display();
        list.insertAtHead(100);
        list.display();
        list.insertnode(2,300);
        list.display();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
        list.deletenode(4);
list.display(); }
}
