// Leetcode 437

public class pathsum3 {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int noOfPaths(Node root,long targetSum){
        if(root==null) return 0;
        int count = 0;
        if((long)(root.val)==targetSum)count++;
        return count + noOfPaths(root.left,targetSum-(long)(root.val)) + noOfPaths(root.right,targetSum-(long)(root.val));
    }
    public int pathSum(Node root, int targetSum) {
        if(root==null)return 0;
        int count  = noOfPaths(root,(long)targetSum);
        count+= (pathSum(root.left,targetSum) + pathSum(root.right,targetSum));
        
        return count;
    }
}
