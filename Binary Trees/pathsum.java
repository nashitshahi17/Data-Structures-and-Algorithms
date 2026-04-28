// Leetcode 112
public class pathsum {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static boolean hasPathSum(Node root,int targetSum){
        if(root==null) return false;
        if(root!=null && root.left==null && root.right==null){
            if(root.val==targetSum) return true;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}
