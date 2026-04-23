// Leetcode 236
public class lowestcommonancestor {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static boolean contains(Node root,Node node){
        if(root==null) return false;
        if(root==node)return true;
        return contains(root.left, node) || contains(root.right, node);
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==root || q==root) return root;
        if(p==q) return root;
        boolean leftp = contains(root.left,p);
        boolean rightq = contains(root.right,q);
        if((leftp && rightq)|| (!leftp && !rightq)) return root;
        if(leftp && !rightq) return lowestCommonAncestor(root.left, p, q);
        if(!leftp && rightq) return lowestCommonAncestor(root.right, p, q);
        return null;
    }
   
}

// Optimized solution
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
//     {
//         if(root==null) return null;
//         if(root==p || root==q) return root;
//         TreeNode left=lowestCommonAncestor(root.left,p,q);
//         TreeNode right=lowestCommonAncestor(root.right,p,q);
//         if(left!=null && right!=null) return root;
//         return left!=null?left:right;

//     }
// }