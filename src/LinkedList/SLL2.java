package LinkedList;

public class SLL2 {
    public  static void print(Node h){
        Node temp = h;
        while(temp.next != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SLL2 list = new SLL2();
//        System.out.println(list);

        Node a = new Node(10);
        Node b = new Node(20);

        Node c = new Node(10);
        Node d = new Node(20);

        Node e = new Node(10);
        Node f = new Node(20);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        System.out.println(a.val);
        System.out.println();
    }
}
