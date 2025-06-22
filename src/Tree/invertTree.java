package Tree;

import java.util.*;
// BF
public class invertTree {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(5);
        Node d = new Node(15);
        Node e = new Node(70);
        Node f = new Node(600);
        Node g = new Node(33);
        Node h = new Node(66);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.left = h;
        c.left = f;
        c.right = g;
        Display(a);
        System.out.println(" level Order ");
        levelOrder(a);
        System.out.println(" level Order right to left ");
        levelOrderR(a);
    }
    public static void Display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        Display(root.left);
        Display(root.right);
    }
    public static void levelOrder(Node root){  // left to right
        Queue<Node> q = new LinkedList<>();
        if(root != null)
            q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left != null) q.add(front.left);
            if(front.right!= null) q.add(front.right);

        }
        System.out.println();

    }
    public static void levelOrderR(Node root){  // rigjt to left
        Queue<Node> q = new LinkedList<>();
        if(root != null)
            q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.right!= null) q.add(front.right);
            if(front.left != null) q.add(front.left);


        }
        System.out.println();

    }
}
