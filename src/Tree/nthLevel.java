package Tree;

import java.util.Scanner;

public class nthLevel {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a =  new Node(1);
        Node b =  new Node(10);
        Node c =  new Node(20);
        Node d =  new Node(30);
        Node e =  new Node(40);
        Node f =  new Node(50);
        Node g =  new Node(60);
        Node h =  new Node(70);
        Node i =  new Node(80);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = h;
        d.left = i;
        preorder(a);
        System.out.println();
        System.out.println("Enter the value of n ");
        n = sc.nextInt();
        nthLevel(a,0);
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void nthLevel(Node root, int level){
        if(root == null) return;
        if(level == n)
            System.out.print(root.val + " ");
        nthLevel(root.left, level + 1);
        nthLevel(root.right, level + 1);
        }
    }



