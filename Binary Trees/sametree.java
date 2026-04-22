public class sametree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static boolean isSametree(Node p,Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSametree(p.left, q.left) && isSametree(p.right, q.right);
    }
}
