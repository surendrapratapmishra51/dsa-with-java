package Tree;

public class productOfTree {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(0);
        Node e = new Node(10);
        Node f = new Node(11);
        Node i = new Node(12);
        Node j = new Node(13);
        a.left = b; a.right= c;
        b.left = d; b.right = e;
        c.left = f; c.right = i;
        f.left = j;
        Display(a);
        System.out.println();
        System.out.print(product(a));
        System.out.println();
        System.out.println(nonZero(a));

    }
    // product of tree
    public static int product(Node root){
        if(root == null)
            return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static void Display(Node root){
        if(root == null)
            return;
        System.out.print(root.val+" ");
        Display(root.left);
        Display(root.right);
    }
    // product of non zoro root;
    public static int nonZero(Node root){
        if(root == null || root.val == 0)
            return 1;
        return root.val*nonZero(root.left)*nonZero(root.right);
    }

}
