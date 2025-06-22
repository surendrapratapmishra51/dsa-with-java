package Tree;

import java.sql.SQLOutput;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = e;

        Display(a);
        System.out.println();
        System.out.println(sum(a));

    }
    public static void Display(Node root){
        if(root == null)
            return;
        System.out.print(root.val+" ");
        Display(root.left);
        Display(root.right);
    }
    public static int sum(Node root){
        if(root == null)
        return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
}
