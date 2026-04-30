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
