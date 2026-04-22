// Leetcode 257
import java.util.*;
public class binaryTreePath {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void helper(Node root,List<String> ans,String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+= root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s+root.val+"->");
        helper(root.right, ans, s+root.val+"->");
    }
    public List<String> binaryTree(Node root){
        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;

    }
}
