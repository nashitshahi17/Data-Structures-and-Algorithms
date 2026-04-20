
public class minprod {
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
    public static int minimum(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minimum(root.left),minimum(root.right)));
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
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
        System.out.println(minimum(root));
        System.out.println(product(root));
    }
}
