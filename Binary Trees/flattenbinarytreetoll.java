// Leetcode 114
public class flattenbinarytreetoll {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
     public void flatten(Node root) {
        if(root==null) return;
        Node left = root.left;
        Node right = root.right;
        root.left = null;
        flatten(left);
        flatten(right);
        root.right = left;
        Node temp = left;
        while(temp!=null && temp.right!=null){
            temp = temp.right;
        }
        if(temp!=null) temp.right = right;
        else root.right = right;
        return;
    }
}

// Morris Traversal Space Complexity O(1)
// public void flatten(TreeNode root) {
//         TreeNode curr = root;
//         while(curr!=null){
//             if(curr.left!=null){
//                 TreeNode pred = curr.left;
//                 while(pred.right!=null){
//                     pred = pred.right;
//                 }
//                 pred.right = curr.right;
//                 curr.right = curr.left;
//                 curr.left = null;
//             }
//             curr = curr.right;
//         }
//     }