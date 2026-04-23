// Leetcode 101 Symmetrictree
public class symmetrictree {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
        
    }
    public boolean isSame(Node p,Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    public TreeNode invert(Node root){
        if(root==null) return root;
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.left = invert(r);
        root.right = invert(l);
        return root;
    }
    public boolean isSymmetric(Node root) {
        if(root==null) return true;
        root.left = invert(root.left);
        return isSame(root.left,root.right);
    }
}
