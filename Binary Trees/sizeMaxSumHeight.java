public class sizeMaxSumHeight {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1+ size(root.left) + size(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        System.out.println(size(root));
    }
}
