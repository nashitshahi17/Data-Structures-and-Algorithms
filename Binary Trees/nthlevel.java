// This is Level Order Traversal without queue. It has T.C O(n)
public class nthlevel {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){
        if(root==null|| (root.left==null && root.right==null)) return 0;
        return 1 + (Math.max(height(root.left),height(root.right)));
    }
    public static void nthlevell(Node root,int level){
        if(root==null) return;
        if(level==1){
            System.out.print(root.val+" ");
            return;
        }
        nthlevell(root.left, level-1);
        nthlevell(root.right, level-1);
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
        int level = height(root)+1;
        for(int i=1;i<=level;i++){
            nthlevell(root, i);
            System.out.println();
        }
    }
}
