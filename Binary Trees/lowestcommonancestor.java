import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class lowestcommonancestor {
    static Node ans = null;
    public static int lca(Node root,Node p, Node q){
        if(root==null) return 0;
        int left = lca(root.left,p,q);
        int right = lca(root.right,p,q);
        int self = 0;
        if(root==q || root==p) self = 1;
        int total = self+left+right;
        if(total ==2 && ans == null) ans = root;
        return total;
    }
    public static Node lowest(Node root,Node p, Node q){
        lca(root,p,q);
        return ans;
    }
    public static Node buildtree(Integer[] arr){
        if(arr.length==0 || arr==null || arr[0]==null){
            return null;
        }
        Node root = new Node(arr[0]);
        int i = 1;
        Deque<Node> q = new ArrayDeque<>();
        q.addLast(root);
        while(i<arr.length){
            Node current = q.pop();
            if(i<arr.length&& arr[i]!=null){
                current.left = new Node(arr[i]);
                q.addLast(current.left);
            }
            i++;
            if(i<arr.length && arr[i]!=null){
                current.right = new Node(arr[i]);
                q.addLast(current.right);
            }
            i++;
        }
        return root;
    }
    public static Node find(Node root,int val){
        if(root==null)return null;
        if(root.val == val) return root;
        Node left = find(root.left, val);
        if(left!=null){
            return left;
        }
        return find(root.right, val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] val = s.trim().split("\\s+");
        Integer[] arr = new Integer[val.length];
        for(int i=0;i<arr.length;i++){
            if(val[i].equalsIgnoreCase("null")){
                arr[i] = null;
            }else{
                arr[i] = Integer.parseInt(val[i]);
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Node root = buildtree(arr);
        Node p = find(root,a);
        Node q = find(root,b);
        Node res = lowest(root, p, q);
        if(res!=null) System.out.println(res.val);


    }
}

// Optimized solution
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
//     {
//         if(root==null) return null;
//         if(root==p || root==q) return root;
//         TreeNode left=lowestCommonAncestor(root.left,p,q);
//         TreeNode right=lowestCommonAncestor(root.right,p,q);
//         if(left!=null && right!=null) return root;
//         return left!=null?left:right;

//     }
// }