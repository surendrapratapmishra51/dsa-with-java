package Tree.BinarySearchTree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class SearchTarget {
    public static void main(String[] args) {
        int target = 11;
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(12);
        TreeNode g = new TreeNode(19);
        TreeNode h = new TreeNode(13);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        f.right = h;
        boolean ans = isExist(a,target);
        System.out.println(ans);

    }
    public static boolean isExist(TreeNode root,int target){
        if(root == null) return false;
        if(root.val == target) return true;
        else if(root.val < target) return isExist(root.right,target);
        else if(root.val > target) return isExist(root.left,target);
        return false;

    }
}
