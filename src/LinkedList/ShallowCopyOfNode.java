package LinkedList;

public class ShallowCopyOfNode {
    public static void main(String[] args) {
        Node a = new Node(100);
//        Node temp = a; // Shallow
        Node temp = new Node(100); // deep copy
        System.out.println(a.val);
        System.out.println(temp.val);
        temp.val = 12;
        System.out.println(temp.val);

    }
}
