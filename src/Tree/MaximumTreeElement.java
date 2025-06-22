package Tree;

public class MaximumTreeElement {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(5);
        Node d = new Node(15);
        Node e = new Node(70);
        Node g = new Node(600);
        Node f = new Node(33);
        Node i = new Node(66);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.left = i;
        c.left = f;
        c.right = g;
        System.out.println("maximum element is = "+ maximum(a));
        System.out.println("minimum element is = "+ minimum(a));
        System.out.println("size of tree is = "+ size(a));
        System.out.println("level of tree = "+ level(a));
        int height = level(a)-1;
        System.out.println("height of height tree = "+ height);





    }
    public static int  maximum(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max((maximum(root.left)),maximum(root.right)));
    }
    public static int  minimum(Node root){
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min((minimum(root.left)),minimum(root.right)));
    }

    public static int size(Node root){
        if(root == null)
            return 0;
        return 1+ size(root.left)+size(root.right);
    }

    public static int level(Node root){
        if(root == null)
            return 0;
        return 1 + Math.max(level(root.left),(level(root.right)));
    }
}
