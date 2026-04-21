// Leetcode 110
public class balancedbinarytree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static boolean isBalanced(Node root){
        if(root==null) return true;
        int lh = height(root.left);
        if(root.left!=null) lh++;
        int rh = height(root.right);
        if(root.right!=null) rh++;
        int d = Math.abs(lh - rh);
        if(d>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
}

// Optimized
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         return height(root) != -1;
//     }

//     private int height(TreeNode node) {
//         if (node == null) return 0;

//         int left = height(node.left);
//         if (left == -1) return -1;

//         int right = height(node.right);
//         if (right == -1) return -1;

//         if (Math.abs(left - right) > 1) return -1;

//         return Math.max(left, right) + 1;
//     }
// }