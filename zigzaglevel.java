// Leetcode 103
import java.util.*;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;
public class zigzaglevel {
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
    public static void nthlevel(Node root,int level,List<Integer> arr){
        if(root==null) return;
        if(level==1){
            arr.add(root.val);
            return;
        }
        nthlevel(root.left, level-1,arr);
        nthlevel(root.right, level-1,arr);
    }
    public static void nthlevel2(Node root,int level,List<Integer> arr){
        if(root==null) return;
        if(level==1){
            arr.add(root.val)
            return;
        }
        nthlevel2(root.right, level-1,arr);
        nthlevel2(root.left, level-1,arr);
    }
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        int level = height(root)+1;
        for(int i=1;i<=level;i++){
            List<Integer> arr = new ArrayList<>();
            if(i%2==0) nthlevel2(root,i,arr);
            else nthlevel(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }
    
}

// Optimized
// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> results = new ArrayList<>();
//         if(root == null) return results;
//         List<TreeNode> current = new ArrayList<>();
//         current.add(root);
//         List<TreeNode> next = null;
//         int dir = 0;
//         while(!current.isEmpty()) {
//             next = new ArrayList<>();
//             List<Integer> list = new ArrayList<>();
//             for(TreeNode node : current) {
//                 if(dir == 0) {
//                     if(node.left != null) next.add(0, node.left);
//                     if(node.right != null) next.add(0, node.right);
//                 } else {
//                     if(node.right != null) next.add(0, node.right);
//                     if(node.left != null) next.add(0, node.left);
//                 }
//                 list.add(node.val);
//             }
//             dir = dir == 0 ? 1 : 0;
//             results.add(list);
//             current = next;
//         }
//         return results;
//     }
// }