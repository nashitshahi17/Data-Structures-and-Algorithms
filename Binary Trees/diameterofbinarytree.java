// Leetcode 543
public class diameterofbinarytree {
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
    public static int diameter(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        int leftans = diameter(root.left);
        int rightans = diameter(root.right);
        int mid = height(root.left) + height(root.right);
        if(root.right!=null) mid++;
        if(root.left!=null) mid++;
        int max = Math.max(leftans,Math.max(rightans,mid));
        return max;
    }
}

// Optimized solution
// class Solution {
//     int d = 0;
//     public int height(TreeNode root){
//         if(root == null) return 0;
//       int left = height(root.left);
//        int right = height(root.right);
//          d = Math.max(d , left+right);
//         return 1 + Math.max(left , right);
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         height(root);
//         return d;
//     }
// }