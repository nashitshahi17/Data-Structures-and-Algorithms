
public class nthlevel {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void nthlevell(Node root,int level){
        if(root==null) return;
        if(level==1)System.out.print(root.val+" ");
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
        nthlevell(root,3);
    }
}
