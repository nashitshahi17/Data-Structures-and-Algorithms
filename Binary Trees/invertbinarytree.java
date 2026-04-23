// Leetcode 226
public class invertbinarytree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node invertTree(Node root){
        if(root==null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }
}
